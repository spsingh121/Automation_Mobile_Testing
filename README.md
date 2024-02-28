#Steps to follow to run your tests
1. Open your Android Studio and start the emulator.
2. Start your Appium Server.
3. Open command Prompt.
4. Type adb devices.
5. Type adb logcat and open dialer app or any other app in which you want to perform testing on your emulator.
6. Return to the command prompt and type ctrl + C.
7. Type dir to open directory.
8. Now create a txt file.
9. Type cd documents.
10. Type adb logcat > lofile.txt
11. Open logfile you just created and search "for activity".
12. Open Appium Inspector and insert the desired capability and start the session.
13. Record your test and generate test script.
14. Open your IDE (IntelliJ IDEA or Eclipse).
15. Add all the jar files which i have shared with you in lib folder and make it as global library.
16. Run the code.
17. All the functions should run automatically in your emulator.
