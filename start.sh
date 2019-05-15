#! /bin/bash

mvn install

cd wx_zph
mvn spring-boot:start

cd ../subscribe
mvn spring-boot:start

cd ../unsubscribe
mvn spring-boot:start

