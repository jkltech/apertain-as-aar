A(P)ertain SDK AAR Integration Instructions with Android Studio App Project
===========================================================================

This document describes step by step instructions to integrate A(P)ertain SDK AAR with Android Studio App Project.

Before you Begin
----------------

Before implementing the SDK, make sure you have the following:

* Download the A(P)ertain SDK AAR from [here](https://github.com/jkltech/apertain-as-aar).
* We would recommend if you clone this github project for future updates.

### Step 1:

Open your Android Studio App Project.

### Step 2:

Right click on your project and choose "Open Module Settings".

![Open Module Settings](http://i.stack.imgur.com/bu5D2.png)

### Step 3:

Click the "+" button in the top left to add a new module.

![Add a New Module](http://i.stack.imgur.com/oEH90.png)

### Step 4:

Choose "Import .JAR or .AAR Package" and click the "Next" button.

![Import .JAR or .AAR - We need to import APertain SDK AAR file](./images/instructions-step-4.png)

### Step 5:

Find the AAR file - "apertain-sdk-lib.aar" from your git clone of the 'apertain-as-aar' SDK Project, using the ellipsis button ("...") beside the "File name" field.

![Choose AAR from your local storage where you cloned the APertain SDK AAR github Repository](./images/instructions-step-5.png)

### Step 6:

Keep the app's module selected and click on the Dependencies pane to add the new module (apertain-sdk-lib) as a dependency.

![Now you need to add the module as dependency to your App Project](./images/instructions-step-6.png)

### Step 7:

Use the "+" button of the dependencies screen and choose "Module dependency".

![Select "Module Dependency" to configure the dependency](./images/instructions-step-7.png)

### Step 8:

Choose the module 'apertain-sdk-lib' and click "OK".

![Select 'apertain-sdk-lib' as Module Dependency of your App](./images/instructions-step-8.png)

Now you have added APertain SDK AAR as a Module inside your App. Please don't forget to sync again from the github whenever there is a new build version available for APertain SDK in the [github project](https://github.com/jkltech/apertain-as-aar).
