#!/bin/sh

curl \
-F "ipa=@./app/build/outputs/apk/release/app-release-unsigned.apk" \
-H "X-HockeyAppToken: a5225739fc4b49c69d147e501354c91f" \
https://rink.hockeyapp.net/api/2/apps/2455b37f401449f0be1c781ad119e2f6/app_versions
