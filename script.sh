#!/bin/bash

base64 /dev/urandom | head -c 5000000 > base64.txt
chmod 555 base64.txt
tar -czf base64.tar.gz base64.txt
md5sum base64.txt
mv base64.tar.gz $(date +%s).tar.gz

