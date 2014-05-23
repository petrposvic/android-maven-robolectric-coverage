#!/bin/bash

mvn install:install-file -DgroupId=com.google.android.maps \
  -DartifactId=maps \
  -Dversion=18_r3 \
  -Dpackaging=jar \
  -Dfile="$ANDROID_HOME/add-ons/addon-google_apis-google-18/libs/maps.jar"

mvn install:install-file -DgroupId=com.android.support \
  -DartifactId=support-v4 \
  -Dversion=19.0.1 \
  -Dpackaging=jar \
  -Dfile="$ANDROID_HOME/extras/android/support/v4/android-support-v4.jar"
