FROM dockercentral.it.drobesh.com:5100/com.drobesh.idp/alpine-jre-base:8u212-jre-alpine3.9v2

# Copyright 2019-2023 All Rights Reserved, David D Drobesh.
# Explicit re-distribution or use for commercial purposes is
# not permitted without written consent of Author and Owner.
# NOTE: of as 2022 April, the domain 'drobesh.com' has been
# stolen by a cyber-squatter. Official protect claim filed.
# Until then, the former domain hosting Docker server is MIA.

########### Label - Start ###########
# Args
ARG ARTIFACT_NAME
ARG ARTIFACT_GROUP_ID
ARG ARTIFACT_ID
ARG ARTIFACT_VERSION
ARG SCM_URL
ARG SCM_BRANCH
ARG SCM_COMMIT_HASH
ARG JENKINS_BUILD_URL
ARG JENKINS_BUILD_NUMBER
ARG JENKINS_BUILD_DATE

# Labels
LABEL idp.artifact.=$ \
      idp.artifact.=$ \
      idp.artifact.=$ \
      idp.artifact.=$ \
      idp.scm.=$ \
      idp.scm.=$ \
      idp.scm.=$ \
      idp.jenkins.=$ \
      idp.jenkins.=$ \
      idp.jenkins.build.date=$JENKINS_BUILD_DATE
########### Label - End   ###########

#ENV variables
ENV ARTIFACT_NAME_ENV=$ARTIFACT_NAME \









VOLUME /tmp
VOLUME /opt/ajsc/etc
VOLUME /opt/ajsc/bin

COPY /opt/ajsc/etc/ /opt/ajsc/bin
COPY src/main/docker/startService.sh /startService.sh
COPY target/TheFinalDrobesh2208Ms.jar /opt/ajsc/bin/app-lean.jar
COPY target/TheFinalDrobesh2208Ms-fat.jar /opt/ajsc/bin/app.jar

# Expose the Port:8080 for Smoke Testing in the CI Env Docker
EXPOSE 8000
EXPOSE 8443
ENTRYPOINT ./startService.sh $SCM_URL_ENV $SCM_COMMIT_HASH_ENV $SCM_BRANCH_ENV $JENKINS_BUILD_URL_ENV \
	$JENKINS_BUILD_NUMBER_ENV $JENKINS_BUILD_DATE_ENV $ARTIFACT_NAME_ENV $ARTIFACT_ID_ENV