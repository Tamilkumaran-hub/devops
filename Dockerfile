FROM jenkins/jenkins:latest
ENV JENKINS_USER admin
ENV JENKINS_PASS admin
ENV JENKINS_JAVA_OPTIONS="-Djenkins.install.runSetupWizard=false"
# ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
EXPOSE 8080
EXPOSE 50000
# ENTRYPOINT ["/usr/bin/tini", "--", "/usr/local/bin/jenkins.sh"]
