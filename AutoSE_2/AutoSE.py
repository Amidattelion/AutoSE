import pyautogui as gui
import subprocess
import random
import time
import msvcrt
from os import listdir
from os.path import isfile, join
import shutil

def moveClick(liste,a,b):
    for i in liste[a:b]:
        gui.moveTo(i[0],i[1],i[2])
        gui.click()

def choixSys(DEF=False):
    a=random.randint(0,10)
    liste=[[892,188,0.5],[350,a*25+385,6],[117,53,0.5],[255,530,1],[336,583,0.1],[745,502,1],[858,508,0.5]]
    # for el in liste:
    #     el[1]-=30
    if not DEF:
        gui.hotkey('ctrl','f7')
        moveClick(liste,0,2)
    # gui.moveTo(gui.locateCenterOnScreen('Rechercher.png',grayscale=True))
    # time.sleep(0.5)
    # gui.click()
    # gui.moveRel(0,a*25)
    # gui.click()
        gui.hotkey('ctrl','f7')
    time.sleep(1)
    gui.press('f2')
    moveClick(liste,2,3)
    # gui.moveTo(gui.locateCenterOnScreen('f2.png',grayscale=True))
    # time.sleep(0.5)
    # gui.moveRel(70,0)
    # gui.click()
    gui.press('esc')
    moveClick(liste,3,7)
    time.sleep(1)
    gui.click()
    # gui.moveTo(gui.locateCenterOnScreen('bandeau.png',grayscale=True))
    # gui.moveRel(100,445)
    # time.sleep(0.5)
    # gui.click()
    # gui.moveRel(0,80)
    # time.sleep(0.5)
    # gui.click()
    # gui.moveTo(gui.locateCenterOnScreen('Export2.png',grayscale=True))
    # time.sleep(0.5)
    gui.moveRel(100,0)
    gui.click()
    # gui.press('esc')
    # time.sleep(1)
    # gui.press('esc')
    
    
             
def lancerScript(script):
    gui.hotkey(',')
    time.sleep(1)
    gui.typewrite('Run '+script, interval=0.0, pause=None, _pause=True)
    time.sleep(1)
    gui.press('enter')
    time.sleep(1)
    gui.press('esc')
    time.sleep(1)
    
def recupDonne(L,inf=['\t',1],sup=['\n',1]):
    k=0
    occInf,occSup=0,0
    if L[k]==inf[0]:occInf+=1
    donnee=''
    
    while occInf!=inf[1]:
        k+=1
        if L[k]==inf[0]:occInf+=1
    
    k+=1
    if L[k]==sup[0]:occSup+=1
        
    while occSup!=sup[1]:
        if L[k]==sup[0]:occSup+=1
        donnee=donnee+L[k]
        k+=1 
        
    donnee=donnee[:-1]
        
    return(donnee)
    
def creerScript(nom,chemin,T):

    types=['Star','Planet','DwarfPlanet','Moon','DwarfMoon','Asteroid','Comet','Barycenter']
    
    
    date=time.localtime()
    script=nom[:-3]
    for i in date[0:5]:
        script=script+'-'+str(i)
    
    with open('export/'+fname,'r') as sysFile:
    
        procedural=True
        
        foyer=recupDonne(sysFile.readline(),['\"',1],['\"',1])
        
        for L in sysFile:
            
            t=0
            trouvee=False
            
            while not trouvee and t<len(types):
                
                if types[t]+'\t' in L:
                    
                    astre=recupDonne(L,['\"',1],['\"',1])
                    if procedural:astre=foyer+' '+astre
                    
                    for i in types:
                        if i in L:typeAstre=i
                    
                    donnees=[]
                    fini=False
                    
                    while not fini:
                        l=sysFile.readline()
                        if 'MeanAnomaly' in l:fini=True
                        donnees.append(l)
                        
                    ParentBody,SMA,Period,TidalLocked,RotationPeriod,Radius='error','error','error',False,'error','error'
                    
                    for n in donnees:
                        
                        if 'ParentBody' in n:ParentBody=recupDonne(n,['\"',1],['\"',1])
                        if 'SemiMajorAxis' in n:SMA=recupDonne(n,[" ",3])
                        if '\tPeriod' in n:Period=recupDonne(n,[" ",6])[4:]
                        if 'TidalLocked' in n:TidalLocked=True
                        if 'RotationPeriod' in n:RotationPeriod=recupDonne(n,[" ",2])
                        if '\tRadius' in n:Radius=float(recupDonne(n,[" ",6])[4:])
                        if '\tRadSol' in n:Radius=float(recupDonne(n,[" ",10]))*695700*1000
                        
                    if TidalLocked:RotationPeriod=str(float(Period)*365)
                    if ParentBody!=foyer:ParentBody=foyer+' '+ParentBody
                        
                    sequenceAstre([chemin,script],[astre,typeAstre,ParentBody,SMA,Period,RotationPeriod,Radius])
                    
                    trouvee=True
                t+=1
                
    with open(chemin+'/'+script+'.sc','a') as scriptFile:
        scriptFile.write('\nPrint Fin')    
    return(script)
        
  
def sequenceAstre(accees,liste):   #[astre,typeAstre,ParentBody,SMA,Period,RotationPeriod,Radius] types=['Star','Planet','DwarfPlanet','Moon','DwarfMoon','Asteroid','Comet','Barycenter']
    
    with open(accees[0]+'/'+accees[1]+'.sc','a') as scriptFile:
        
        W=280//14
        T=1
        SMA=str(float(liste[3])*4*150e6)
        P=(float(liste[4]))*365*24*60*6*T
        PR=(float(liste[5]))*24*60*T
        
        if liste[1] in ['Planet','DwarfPlanet','Moon']:
            
            W=280//14
            
            if liste[6]>15000:landing=[]
            else:landing=['TimeScale 1','Untrack','Wait 1','Land 5','Wait 6','TimeScale '+str(P//10),'Wait '+str(W*3),'Track']
            
            for el in ['GotoFast '+liste[2],'Print '+liste[2],'Track','TimeScale '+str(P),'LandTo 0 0 '+SMA,'Wait '+str(W),'LandTo 0 120 '+SMA,'Wait '+str(W),'LandTo 0 240 '+SMA,'Wait '+str(W),'LandTo 0 360 '+SMA,'Wait '+str(W),'TimeScale '+str(P),'Wait '+str(W),'LandTo 120 0 '+SMA,'Wait '+str(W),'LandTo 240 0 '+SMA,'Wait '+str(W),'LandTo 360 0 '+SMA,'Wait '+str(W),'TimeScale 1','Untrack','Wait 2','GotoFast '+liste[0],'Print '+liste[0],'Track','TimeScale '+str(PR),'LandTo 0 0 '+str(liste[6]*2),'Wait '+str(W),landing,'LandTo 0 120 '+str(liste[6]*2),'Wait '+str(W),landing,'LandTo 0 240 '+str(liste[6]*2),'Wait '+str(W),landing,'LandTo 0 360 '+str(liste[6]*2),'Wait '+str(W),landing,'TimeScale '+str(P),'Wait '+str(W),landing,'LandTo 120 0 '+str(liste[6]*2),'Wait '+str(W),landing,'LandTo 240 0 '+str(liste[6]*2),'Wait '+str(W),landing,'LandTo 360 0 '+str(liste[6]*2),'Wait '+str(W),landing,'TimeScale 1','Untrack']:
                
                if el==landing:
                    for k in el:
                        scriptFile.write(k+'\n')
                    
                else:
                    scriptFile.write(el+'\n')
                
        elif not liste[1] in ['Asteroid','Comet','DwarfMoon']:
            
            W=140//14
            
            for el in ['GotoFast '+liste[2],'Print '+liste[2],'Track','TimeScale '+str(P),'LandTo 0 0 '+SMA,'Wait '+str(W),'LandTo 0 120 '+SMA,'Wait '+str(W),'LandTo 0 240 '+SMA,'Wait '+str(W),'LandTo 0 360 '+SMA,'Wait '+str(W),'TimeScale '+str(P),'Wait '+str(W),'LandTo 120 0 '+SMA,'Wait '+str(W),'LandTo 240 0 '+SMA,'Wait '+str(W),'LandTo 360 0 '+SMA,'Wait '+str(W),'TimeScale 1','Untrack','Wait 2','GotoFast '+liste[0],'Print '+liste[0],'Track','TimeScale '+str(PR),'LandTo 0 0 '+str(liste[6]*2),'Wait '+str(W),'LandTo 0 120 '+str(liste[6]*2),'Wait '+str(W),'LandTo 0 240 '+str(liste[6]*2),'Wait '+str(W),'LandTo 0 360 '+str(liste[6]*2),'Wait '+str(W),'TimeScale '+str(P),'Wait '+str(W),'LandTo 120 0 '+str(liste[6]*2),'Wait '+str(W),'LandTo 240 0 '+str(liste[6]*2),'Wait '+str(W),'LandTo 360 0 '+str(liste[6]*2),'Wait '+str(W),'TimeScale 1','Untrack']:
                
                scriptFile.write(el+'\n')
        else:
            return(None)
                
        # else:
            # for el in ['GotoFast '+liste[0],'TimeScale '+str(float(liste[5])*24*60*6),'Wait 10','TimeScale 1']:
            #     scriptFile.write(el+'\n')

stop = False

log=open('C:/Users/Adrien/Desktop/SpaceEngine/system/se.log','a')

log.seek(0)

log.truncate()

log.write('AutoSE is modifying this log to communicate with SE\nPlease stop AutoSE and relaunch SE to get a clear log !')

log.close

log=open('C:/Users/Adrien/Desktop/SpaceEngine/system/se.log','r')

with open('C:/Users/Adrien/Desktop/SpaceEngine/data/scripts/AutoSE.sc','a') as file:
    file.seek(0)
    file.truncate()
    file.write("Print Lancement d'AutoSE")

with open('C:/Users/Adrien/Desktop/SpaceEngine/data/scripts/AutoSEDEF.sc','a') as file:
    file.seek(0)
    file.truncate()
    file.write("Print Lancement d'AutoSE sur le systeme selectionne.")
    
pause=True
    
while not stop: 
    
    contenu=[l for l in log] 
    DEF=False
    
    while not ('[MT] Loading script \"data/scripts/AutoSE.sc\"\n' in contenu or '[MT] Loading script \"data/scripts/AutoSEDEF.sc\"\n' in contenu) and pause:
        contenu=[l for l in log]
        time.sleep(1)
    
    if '[MT] Loading script \"data/scripts/AutoSE.sc\"\n' in contenu: gui.press('esc')    
    if '[MT] Loading script \"data/scripts/AutoSEDEF.sc\"\n' in contenu: 
        gui.press('esc')
        DEF=True
    
    contenu=log.readline()
    contenu=log.readline()
    
    pause=False
        
    time.sleep(2)
    
    # while type(gui.locateCenterOnScreen('bandeau.png',grayscale=True))=='NoneType':
    #     gui.moveTo(gui.locateCenterOnScreen('bandeau.png',grayscale=True))
    # time.sleep(0.5)
    # gui.click()
    
    choixSys(DEF)
    
    shutil.move('C:/Users/Adrien/Desktop/SpaceEngine/export','C:/Users/Adrien/Desktop/AutoSE')
    fichier = [f for f in listdir('C:/Users/Adrien/Desktop/AutoSE/export') if isfile(join('C:/Users/Adrien/Desktop/AutoSE/export', f))]
    fname=fichier[0]
    types=['Star','DwarfPlanet','Planet','DwarfMoon','Moon','Asteroid','Comet','Barycenter'] 
    lancerScript(creerScript(fname,'C:/Users/Adrien/Desktop/SpaceEngine/data/scripts',1))
    
    shutil.rmtree('C:/Users/Adrien/Desktop/AutoSE/export')
            
        # else:
        #     stop=True
        
    # depart=0
    
    while not ('[MT] Script terminé\n' in contenu) and not ('[MT] Script interrompu\n' in contenu) and not ('[MT] Script finished\n' in contenu):
        contenu=[l for l in log]
        time.sleep(1)
    
    if ('[MT] Script interrompu\n' in contenu) or  ('[MT] Script interrupted\n' in contenu) :pause=True
    
shutil.rmtree('C:/Users/Adrien/Desktop/SpaceEngine/data/scripts/AutoSE.sc')
    
    
    
