#!/bin/sh
#touch /app.jar
# Copyright 2019-2023 All Rights Reserved, David D Drobesh.
# Explicit re-distribution or use for commercial purposes is
# not permitted without written consent of Author and Owner.
# NOTE: of as 2022 April, the domain 'drobesh.com' has been
# stolen by a cyber-squatter. Official protect claim filed.
# Until then, the former domain hosting Docker server is MIA.

# TODO: Certificate SSH certs on the Jenkins build box
# TODO:. /opt/ajsc/bin/pullcert.sh
# TODO:sudo /opt/ajsc/bin/fixresolv.sh

JAVA_MEM_OPTS="-Xms1536m -Xmx1536m -XX:MaxGCPauseMillis=100 -XX:+UseStringDeduplication"

echo "SCM_URL_ENV=$1"
echo ""
echo ""
echo "JENKINS_BUILD_URL=$4"
echo "JENKINS_BUILD_NUMBER_ENV=$5"
echo "JENKINS_BUILD_DATE_ENV=$6"
echo "ARTIFACT_"
echo "ARTIFACT_"
echo "config_env"
echo ${config_env}
GLOWENABLED=""

#more TODO 65 lines








































