# sample-source

### Project Initialization.
`spring init -j=1.8 --package-name=com.upmce.samplesource -g=com.upmce.samplesource -a=sample-source -n=sample-source -d=web -build=gradle -p=jar sample-source`

### Docker Setup.
* Add .dockerignore file
* Add Dockerfile
* Build using..
  `docker build -t kmjohny/source:1.0 .`
* Push image to repository.

### Create ssl certificate.
openssl req -x509 -newkey rsa:4096 -keyout source-key.pem -out source-crt.pem -days 365 -config openssl.cnf

