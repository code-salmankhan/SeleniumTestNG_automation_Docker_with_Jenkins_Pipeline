#!/bin/bash

# Navigate to the directory containing the docker-compose.yml file
cd /Users/salmankhan/Documents/Coding/Eclipse/Project/sdet/

# Run docker-compose up
docker-compose up -d

#3 more nodes for chrome
docker-compose scale chrome=3
