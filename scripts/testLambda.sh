#!/bin/bash

if [ "${RUNTIME_JAVA}" = "" ]
then
    RUNTIME_JAVA=java
fi

bindir=`dirname $0`

. ${bindir}/env.sh

cd ${bindir}/../lambda

BOOT=`${RUNTIME_JAVA} -cp classfiles BootstrapClasspath`
VERSION=`${RUNTIME_JAVA} -cp classfiles JavaVersion`

java -cp ${bindir}/../scripts/javac.bin:${JAVAC_SOURCE} com.sun.tools.javac.Main -d classfiles -sourcepath src/java:../goto/src/test -cp classfiles:${JUNIT_CP} -source ${VERSION} -target ${VERSION} -bootclasspath ${BOOT} src/test/TestLambda.java src/java/LambdaExample.java

COMPILATION_EXIT=$?
if [ ${COMPILATION_EXIT} -ne 0 ]
then
    exit ${COMPILATION_EXIT}
fi

${RUNTIME_JAVA} -cp classfiles:${JUNIT_CP} org.junit.runner.JUnitCore TestLambda




