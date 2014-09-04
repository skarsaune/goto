#!/bin/bash

bindir=`dirname $0`

. ${bindir}/env.sh


TEST=$1
DIR=$2

cd ../${DIR}

echo "TESTS:"
#javap -p bin/${TEST}.class | grep test

javac -d bin -cp ../scripts/javac.bin:${JUNIT_CP} -sourcepath src/java:../goto/src/test src/test/${TEST}.java

java -cp classdir:bin:../scripts/javac.bin:${JAVAC_SOURCE}:${JUNIT_CP}:${JAVAC_SOURCE}:../goto/bin  org.junit.runner.JUnitCore ${TEST} | grep -v 'at '
