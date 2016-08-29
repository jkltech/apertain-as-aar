A(P)ertain SDK AAR Integration Instructions with Android Studio App Project
===========================================================================

This document describes step by step instructions to integrate A(P)ertain SDK AAR with Android Studio App Project.

Before you Begin
----------------

* Login to the [APertain Console](https://www.apertain.com/login.apt) and navigate to "Interactions --> Push Notifications --> Push Configuration". Follow the below Steps.

### Step: 1:

Here you create your own Project for your Organization or the Client and add Apps relevant to your organization by using Add New Project.

![Go to Firebase Console](./images/firebase/fbase-instructions-step-1.png)

### Step: 2:

Create an awesome new Project.

![Create a New Project](./images/firebase/fbase-instructions-step-2.png)

### Step: 3: 

Add App

![Add App](./images/firebase/fbase-instructions-step-3.png)

### Step: 4: 

Select Add Firebase to your Android App.

![Add Firebase to your Android App](./images/firebase/fbase-instructions-step-4.png)

### Step: 5: 

Download Google Services JSON (google-services.json) file for your App and also note down App ID of your App.

![Download Google Services JSON and Note App ID value](./images/firebase/fbase-instructions-step-4.png)

### Step: 6: 

Go to Cloud Messaging and Note Down Android Projects Server Key & Sender ID.

![Note Down Android Projects Server Key & Sender ID](./images/firebase/fbase-instructions-step-6.png)

### Step: 7: 

Configure APertain Console with the noted down data such as App ID, relevant to your App and Server Key & Sender ID which are relevant to all your Firebase Android Apps.

![Configure your APertain Console](./images/firebase/fbase-instructions-step-7.png)

### Step 8: Adding Firebase SDK in App

First, add rules to your root-level build.gradle file, to include the google-services plugin:

	buildscript {
		// ...
		dependencies {
			// ...
			classpath 'com.google.gms:google-services:3.0.0'
		}
	}

Then, in your module Gradle file (usually the app/build.gradle), add the apply plugin line at the bottom of the file to enable the Gradle plugin:

	apply plugin: 'com.android.application'

	android {
	  // ...
	}

	dependencies {
	  // ...
	  compile 'com.google.firebase:firebase-core:9.4.0'
	}

	// ADD THIS AT THE BOTTOM
	apply plugin: 'com.google.gms.google-services'

## NOTE: 

Instructions to integrate FCM with iOS or APNS with iOS will follow in another document as iOS SDK is made available. APertain iOS SDK is under development & will be made available soon.