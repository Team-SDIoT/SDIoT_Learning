# Android Architecture Components

These are components introduced on Official Android Developers page. The aim is to design an app architecture which can be mantained and tested easily.
There are 4 major components:
* UI Controllers
* View Model
* Repository
* Data Sources

## UI Controllers
These are components which control the user interface of the app. For example, Activities and Fragments. These are supposed to be as lean as possible.

## View Model
View Models are the only point of contact for UI controllers. They supply *observable* data to the UI Controllers. 

## Repository
Repository is responsible for updating View Model Data. All the implementation on how to get data into the app database happens here.

## Data Sources
These are the sources of data for the app. For example, the Internet.

