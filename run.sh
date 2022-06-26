#!/bin/sh
gradle build && cd build/libs
java -jar SE_Aufgabe_14.jar
cd ../..