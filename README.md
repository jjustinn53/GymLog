# GymLog Application
All of the associated videos are linked [in this Panopto folder](https://csumb.hosted.panopto.com/Panopto/Pages/Sessions/List.aspx#folderID=%22971bdb02-f5c8-4ba7-bedd-b19e0155ba0a%22). It may be necessary to log in to your CSUMB account to view the videos.
The goal of this project is to work through all the steps necessary to create an app that uses the Room database wrapper for persistence and that allows users to log in. 
If I am feeling brave I will add in a recycler view too.

## Overview and plan
[intro video](https://csumb.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=590f9a51-5871-4acb-9465-b2300133a5f5)
This is the overall view of the final product.  Once I get the login screen setup and working, including the logout features, I will record this video.  Anything afer this (editing logs, more user info, etc. Will be shown in their respective video).


## Video 01: Setup
1. Create a gitignore file
2. Create a branch
3. make the initial layout

## Video 02: Basic functions
1. Add [viewBindings](https://developer.android.com/topic/libraries/view-binding) 
1. Wire up the button
1. Read information from the display
1. Log our info
1. Test the display

## Video 03: Add the Database
1. Add the room dependancies
   * [Android Room Dependency](https://developer.android.com/jetpack/androidx/releases/room)
1. create the POJO entity objects
	* for now just a GymLog
1. Create the database interface
1. Create the GymLog DAO
1. Make the repository
	* Requires lots of lambdas and auto-completes

## Video 04: Use the Database
1. Create a type converter
1. Use the Room Repo to write/read logs.

## Video 05: fix the problems
1. Add a singleton to fix the non main thread issue
1. Show the app inspector
1. Write a log to the DB
1. show it in app inspector!
1. add a toString

## Video 06: Update display
1. Fix it so an empty string will not insert a log
1. Clean up the toString()
1. Use the retrieved records to update the display.

## Video 07: Add users
1. Create a User POJO
1. User DAO
1. Update the DB repo to allow user operations
1. Update gymLog to have a userId field

## Video 08: add a login screen
1. Why aren't we getting default users.
	* i.e. why is the callback not working?
1. Add a login screen

## Video 09: add menu and logout function.
1. Add a menu to facilitate logging in and out
	* [Menu resources](https://developer.android.com/guide/topics/resources/menu-resource)
1. Add logout function
1. Add alertDialog for logout.

## Video 10: update our login screen
1. Make login screen use database

## Video 11: Update login screen to use LiveData
1. UserDao --> return LiveData
1. GymLogRepository --> return LiveData
1. update Login method

## Video 13:
1. Add user preferences to store login info
1. Make MainActivity sort by user

## Bugs to fix
1. User login is not persisting... wtf?
1. display is not updating immediatly...
	* Issue is with asynch so adding a recycler will fix it...

## Add a recycler
1. Update the GymLog DAO to return liveData
2. Create the viewHolder
3. Create the adapter
4. Update MainActivity to have a recycler view
5. profit?
