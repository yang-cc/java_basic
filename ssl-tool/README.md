`javac InstallCert.java`  
will generate 2 files:  
**InstallCert\$SavingTrustManager.class**  
**InstallCert.class**  

`java InstallCert EXAMPLE.YOURDOMAIN:8443`  
Enter **1** to trust the certification.  
will generate 1 file: **jssecacerts**  

you can either copy file:  
`cp jssecacerts $JAVA_HOME/jre/lib/security/`  
or add following code into your code:  
`System.setProperty("javax.net.ssl.trustStore", "YOUR jssecacerts FILE PATH");`  

restart your app, *https://EXAMPLE.YOURDOMAIN:8443* will be OK.
