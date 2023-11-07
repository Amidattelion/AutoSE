# AutoSE
This script controls the SpaceEngine software (https://store.steampowered.com/app/314650/SpaceEngine/) with pyautogui to automatically navigate in the universe sandbox and use it as an animated background.
Control Space Engine software through Python AutoGUI module and SE scripts to use Space Engine as a kind of self-exploring universe animated background.

# Setup:

**1 - Clone the repository with git (https://github.com/Amidattelion/AutoSE.git) or download and extract it**

**2 - Install the requirements with pip:**

It is advised to first create and activate a dedicated virtual environment before proceeding.
Open a terminal and cd in the "SYMP" folder that you have just extracted, then run the following command to install the python dependencies:

```
$ pip install -r requirements.txt
```

**3 - Edit AutoSE.py**

Change the variable "SE_path" to set the correct path to your SpaceEngine folder

**4 - Launch AutoSE.py**

**5 - Launch SpaceEngine**

**6 - In SpaceEngine, open the script window and launch the 'AutoSE.sc' script**

This will triger pyautogui and launch SpaceEngine automation. Note that mouse and keyboard will no more be available: making a violent mouvement with the mouse will force the script to stop.
