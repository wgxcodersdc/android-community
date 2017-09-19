## Welcome to the Android Getting Started Guide ##

**Table of Contents**
* <a href="#WhatsAndroid">What is Android?</a>
* <a href="#AndroidUses">What is Android used for?</a>
* <a href="#AndroidTools">Which tools do I need?</a>
* <a href="#PhoneNotNeeded">Do I need a phone to make Android apps?</a>
* <a href="#InstallJava">What should I do first? (Install Java)</a>
* <a href="#InstallAS">Now what? (Install Android Studio)</a>
* <a href="#InstallPackages">Install Necessary Packages</a>
* <a href="#SetupPhone">Setup your phone/tablet</a>
* <a href="#JavaResources">Java Resources</a>
* <a href="#Help">Get Help</a>
* <a href="#KeepInTouch">Keep in Touch</a>

### <a name="WhatsAndroid">What is Android?</a> ###

Android is a software stack for mobile devices that includes an operating system, middleware, and key applications. The Android Software Development Kit (SDK) provides the tools and Application Programming Interfaces (APIs) necessary to begin developing applications on the Android platform using the Java programming language.  You should know the basics of Java programming before starting your Android journey.  A good course to learn enough Java to prepare for Android programming is Udemy’s [Become an Android Developer From Scratch](https://www.udemy.com/become-an-android-developer-from-scratch/) course.  More <a href="#JavaResources">Java resources</a> can be found at the end of this document.

### <a name="AndroidUses">What is Android used for?</a> ###

Android is used for making applications (apps) that run on Android devices.  This includes Android smartphones, smartwatches (Android Wear), and anything else that runs on the [Android operating system](https://developer.android.com/about/index.html) (OS) like [Andorid Wear](https://developer.android.com/wear/index.html), [Android TV](https://developer.android.com/tv/index.html), and [Android Auto](https://developer.android.com/auto/index.html).  Once developed, Android applications can be packaged easily and distributed or sold either through a store such as Google Play or the Amazon Appstore.

### <a name="AndroidTools">Which tools do I need?</a> ###

You can write Android programs on PCs, Macs, and Linux machines.  This is unlike writing apps for iOS devices which can only be done on Macs legally.  You’ll need a piece of software called an IDE (Integrated Development Environment).  Android Studio is now the official IDE for Android, which we recommend.  It’s a free download and works on all platforms. Although there are other IDEs available to use with Android, such as Eclipse and IntelliJ, we are hoping to steer everyone towards Android Studio as that is the platform fully supported by Google, the developer of Android,  moving forward.  You will also need both the Java Development Kit (JDK) and the Android SDK.  Note:  the JDK is different than the JRE (Java Runtime Environment) which allows people to run Java programs.  We need the JDK to be able to write Java programs.

### <a name="PhoneNotNeeded">Do I need an Android phone/tablet in order to make an app?</a> ###

No!  Though it sure is fun to put the apps you make on your own device.  The Android SDK includes a mobile device emulator — a virtual mobile device that runs on your computer. The emulator lets you develop and test Android applications without using a physical device. 

### <a name="InstallJava">I'm ready to get started.  What should I do first?</a> ###

Check to see that you have JDK 7 or JDK 8 on your computer.  

* **Windows**:  visit [https://www.java.com/verify/](https://www.java.com/verify/) to check to see if the JDK is already installed on your machine.  Remember this is the JDK, not the JRE.

* **Mac/Linux**:  open a terminal window and type "which javac".  If something appears, then you have a version of the Java JDK on your machine.  If you’d like to know which version of Java you have, type “javac -version”.

* If you don’t have Java on your machine, install the JDK by visiting [Oracle’s website](http://www.oracle.com/technetwork/java/javase/downloads/index.html) and downloading the most recent version of the Java SE 7 that is appropriate for your machine.

### <a name="InstallAS">Okay, I’ve got Java.  Now what?</a> ###

Now it’s time to download the most recent version of Android Studio, the official Android IDE.  Visit [http://developer.android.com/sdk/index.html](http://developer.android.com/sdk/index.html) to get the software appropriate for your operating system.

**To set up Android Studio on Windows:**

* Launch the .exe file you just downloaded.

* Follow the setup wizard to install Android Studio and any necessary SDK tools. (If you are new to Android Studio, you can’t go wrong with installing with default settings - you can always add additional packages later.)

**To set up Android Studio on Mac OSX:**

* Launch the .dmg file you just downloaded.

* Drag and drop Android Studio into the Applications folder.

* Open Android Studio and follow the setup wizard to install any necessary SDK tools.

* Depending on your security settings, when you attempt to open Android Studio, you might see a warning that says the package is damaged and should be moved to the trash. If this happens, go to System Preferences > Security & Privacy and under Allow applications downloaded from, select Anywhere. Then open Android Studio again.

If you need to use the Android SDK tools from a command line, you can access them at:  /Users/<user>/Library/Android/sdk/.

**To set up Android Studio on Linux:**

* Unpack the downloaded ZIP file into an appropriate location for your applications.

* To launch Android Studio, navigate to the android-studio/bin/ directory in a terminal and execute studio.sh.

* You may want to add android-studio/bin/ to your PATH environmental variable so that you can start Android Studio from any directory. (Ex: `export PATH=$PATH:~/your_android_directory/android-studio/bin`) [For more info, see this guide.](http://www.codeproject.com/Articles/802813/Setting-Up-Android-Development-Ubuntu)

* Follow the setup wizard to install any necessary SDK tools.

**Ensure that you have the most recent version of Android Studio:**

After launching Android Studio, select the check for updates option in the toolbar.

### <a name="InstallPackages">Wait, there's more!  Time to install packages.</a> ###

Android Studio doesn't work right out of the box, so we will have to install some additional packages in order to make it run properly.  Here are the ones we recommend; you can always add additional packages or delete unnecessary ones later.

* Open Android Studio.
* On the Welcome menu, click on _Configure_.
* Select _SDK Manager_.
* In the window that opens, select the following packages:
  *  Tools - this should select all items in that category.
  *  Android 4.4.2 (API 19)
  *  In the Extras category:  Android Support Repository, Android Support Library, Google Repository, and Google USB Driver
* Select _Install Packages_.
* Accept License Agreement.
* Grab your favorite beverage or book to read; this is going to take a while.  

### <a name="SetupPhone">Let’s take the time to set up your phone.</a> ###

Now is a good time as any to set up your phone/tablet if you have one. emember, you can build and test many apps with just the built-in emulator, so the connected phone/tablet is just a bonus.  You have to do four things to enable testing of your apps on your device:

* Ensure your phone will allow the installation of apps from unknown sources (the unknown source is you rather than apps from the Play Store.)  Try looking under Settings → Security and make sure the checkbox for _Unknown Sources_ is checked.

* Turn on _Developer Options_ under Settings if that option isn't currently available.  To do this, go to About Phone, find the build number, and click on it several times until it unlocks Developer Options.

* Allow _USB debugging_.  Try looking under Settings → Developer Options and check the USB debugging box.

* Connect your Android phone to your computer via a cable.




### <a name="JavaResources">Java Resources</a> ###

* Courses

  * [Java for Complete Beginners (Udemy)](https://www.udemy.com/java-tutorial/)
  * [Stanford University’s Introduction to Java](http://see.stanford.edu/see/courseinfo.aspx?coll=824a47e1-135f-4508-a5aa-866adcae1111)
  * [A Bachelor’s Level Computer Science Curriculum](http://blog.agupieware.com/2014/05/online-learning-bachelors-level.html)
  * [Intro to Programming Udacity: Java](https://www.udacity.com/course/cs046)
  * [MIT’s Introduction to Programming in Java](http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/)
  * [Coursera Introduction to Android Programming](https://class.coursera.org/android-001/lecture)
  * [Intro to Programming](http://www.saylor.org/courses/cs101/)
  * [Virtual Pair Programmers](https://www.virtualpairprogrammers.com/training-courses/Java-Fundamentals-training.html)


### <a name="Help">Where to go for help</a> ###

* **[Google] (http://www.developer.android.com)** - Android Studio just came out of Beta in the fall, so if you need help with Android Studio specifically, make sure you check the dates of the search results and only use recommendations/answers from the last six months. Prior to this, Eclipse was a popular IDE choice, (and will probably remain widely used for the near future) so some tutorials may give you Eclipse directions.
* Come to **[Android Labs](http://www.meetup.com/Women-Who-Code-DC/)**. You will get the most out of our hack nights if you follow one of our suggested resources.  These are the classes/books/resources that our members know the best and for which they can offer the most support.  The goal of the hack night is to help you learn the skills that will assist you with programming problems you may see in your workplace; not to actually assist you with work related to your job.  Asking problems specific to work projects derails the productivity of everyone at the event and may result in you not being included in future hack nights.


### <a name="KeepInTouch">Keep in touch!</a> ###
* [Tweet](https://twitter.com/WomenWhoCodeDC) us.
* Email us - WWCodeDC@gmail.com
* Check us out on [Github](https://github.com/womenwhocodedc).
* Visit our [website](http://womenwhocodedc.github.io/).
* Join our [Slack](https://docs.google.com/forms/d/1BXxIJuCawYt3pEzN7-6CgdT6XrhvG0KYQpOqdmv98DY/viewform) group.
