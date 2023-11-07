import pyautogui as gui
import subprocess
import random
import time
import msvcrt
from os import listdir
from os.path import isfile, join
import shutil

while True:
    gui.moveTo(gui.locateCenterOnScreen('f2.png',grayscale=True))
    print((gui.locateCenterOnScreen('f2.png',grayscale=True)))