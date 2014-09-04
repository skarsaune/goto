#!/bin/bash -x

bindir=`dirname $0`

. ${bindir}/env.sh

TAG=$1

JAVAC_SOURCE=${OPENJDK_HOME}/l\
angtools/src/share/classes

pushd ${OPENJDK_HOME}/langtools > /dev/null
hg diff -r ${TAG}
echo "Loading `hg diff -r ${TAG} | grep -c '+'` lines of code" 
hg checkout ${TAG} 
popd

javac -nowarn -sourcepath ${JAVAC_SOURCE} -d javac.bin ${JAVAC_SOURCE}/com/sun/tools/javac/main/JavaCompiler.java
