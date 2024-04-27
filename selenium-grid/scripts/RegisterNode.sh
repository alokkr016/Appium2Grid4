#!/usr/bin/env bash
#echo Hi from
FILE_PATH=$PWD/selenium-grid
#java --version
#ls $FILE_PATH
#ls $FILE_PATH/configuration
java -jar "$FILE_PATH"/selenium-server-4.20.0.jar node --config "$FILE_PATH"/configuration/configAndroid.toml &
sleep 5

