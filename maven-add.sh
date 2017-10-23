mvn clean install deploy:deploy-file -DgroupId=com.dlt.demo.iot.datacenter.ocp.businessrules \
    -DartifactId=SensorRules \
    -Dversion=1.0 \
    -Dpackaging=jar \
    -Dfile=target/SensorRules-1.0.jar \
    -DgeneratePom=true \
    -DrepositoryId=iotdj-nexus \
    -Durl=http://nexus-iotdj-docp.192.168.107.2.nip.io/repository/maven-releases/
