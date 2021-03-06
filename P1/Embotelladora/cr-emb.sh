#!/bin/bash
hamcrest="./../hamcrest-core-1.3.jar"
junit="./../junit-4.12.jar"

if [[ -f "$hamcrest" ]] && [[ -f "$junit" ]]; then
	javac -cp .:"$hamcrest":"$junit" EmbotelladoraTest.java
	javac -cp .:"$hamcrest":"$junit" AllTests.java
	java -cp .:"$hamcrest":"$junit" AllTests
else
	echo "Error. JUnit libs not in ./../"
fi