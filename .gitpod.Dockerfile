FROM gitpod/workspace-full

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && sdk install java 17.0.1-open && sdk default java 17.0.1-open"

RUN "npm install -g nodemon"