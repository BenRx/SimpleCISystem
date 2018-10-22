#!/bin/sh

curl \
-F "ipa=@./app/build/outputs/apk/release/app-release-unsigned.apk" \
-H "X-HockeyAppToken: $HOCKEYAPP_TOKEN" \
https://rink.hockeyapp.net/api/2/apps/$HOCKEYAPP_ID/app_versions
