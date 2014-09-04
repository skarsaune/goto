#!/bin/bash

PATH=/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin:${PATH}

bindir=`dirname $0`

${bindir}/runGotoTest.sh TestLambdaCompilation lambda


