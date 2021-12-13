#!/bin/bash

#build app images 
 docker build -t manajemen-resiko-app . && 
 #Run container 
 docker run -it --rm --name manajemen-resiko-app manajemen-resiko-app