
rem           This source code is part of the KFRAMEWORK  (http:\\k-framework.sourceforge.net\)
rem           Copyright (C) 2001  Alejandro Vazquez, Ke Li
rem           Feedback \ Bug Reports vmaxxed@users.sourceforge.net
rem           
rem           This library is free software; you can redistribute it and\or
rem           modify it under the terms of the GNU Lesser General Public
rem           License as published by the Free Software Foundation; either
rem           version 2.1 of the License, or (at your option) any later version.
rem           
rem           This library is distributed in the hope that it will be useful,
rem           but WITHOUT ANY WARRANTY; without even the implied warranty of
rem           MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
rem           Lesser General Public License for more details.
rem           
rem           You should have received a copy of the GNU Lesser General Public
rem           License along with this library; if not, write to the Free Software
rem           Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
rem           

rem ---------------------------------------------------------------------------------------------------------------
rem     Make a keystore and a key ( 1 time, or when new key required )
rem
rem 	keytool  -genkey -keyalg rsa -keysize 1024 -alias KFrameworkKey01 -validity 3650 -keystore KFrameworkStore00
rem ---------------------------------------------------------------------------------------------------------------

echo "* Remove old libraries... "

del *.orig
del *.sig

del KFrameworkBase.jar
del KFrameworkClient.jar
del KFrameworkServer.jar 
del Sample2ProblemDomainComponent.jar
del Sample2Client1.jar

del activation-1.1.jar
del jcalendar-1.3.2.jar
del jcommon-1.0.15.jar
del jcommon-1.0.0.jar
del jfreechart-1.0.0.jar
del swing-layout-1.0.3.jar
del openjpa-2.0.0.jar

del xmlpull-1.1.3.1.jar
del xpp3_min-1.1.4c.jar
del xstream-1.4.3.jar

pause
echo "* Update all libraries... "
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\KFramework3Base-3.1.jar KFrameworkBase.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\KFramework3Client-3.1.jar KFrameworkClient.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\KFramework3Server-3.1.jar KFrameworkServer.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\Sample2ProblemDomainComponent-3.1.jar Sample2ProblemDomainComponent.jar
copy ..\..\..\..\Sample2Client1\target\Sample2Client1-3.1.jar Sample2Client1.jar

copy ..\..\..\target\Sample2Server1\WEB-INF\lib\activation-1.1.jar                            activation-1.1.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\jcalendar-1.3.2.jar                           jcalendar-1.3.2.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\jcommon-1.0.15.jar                             jcommon-1.0.15.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\jcommon-1.0.0.jar                             jcommon-1.0.0.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\jfreechart-1.0.0.jar                          jfreechart-1.0.0.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\swing-layout-1.0.3.jar                        swing-layout-1.0.3.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\openjpa-2.0.0.jar                             javax.persistence.jar

copy ..\..\..\target\Sample2Server1\WEB-INF\lib\xmlpull-1.1.3.1.jar                           xmlpull-1.1.3.1.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\xpp3_min-1.1.4c.jar                           xpp3_min-1.1.4c.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\xstream-1.4.3.jar                             xstream-1.4.3.jar

copy ..\..\..\target\Sample2Server1\WEB-INF\lib\jasperreports-3.5.3.jar                       jasperreports-3.5.3.jar
copy ..\..\..\target\Sample2Server1\WEB-INF\lib\jasperreports-5.2.0.jar 			jasperreports-5.2.0.jar


rem sign all 
rem create cert: keytool -genkey -alias <alias name> -keystore <key file> -validity 365
echo "* sign libraries... "
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe"  -keystore KFrameworkStore00  -storepass password  -keypass password    KFrameworkBase.jar                    ThoiykApp  
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    KFrameworkClient.jar             	    ThoiykApp  
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    KFrameworkServer.jar      			ThoiykApp  
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    Sample2ProblemDomainComponent.jar     ThoiykApp  
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    Sample2Client1.jar                    ThoiykApp  

"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    activation-1.1.jar  	                    ThoiykApp  
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    jcalendar-1.3.2.jar  	                    ThoiykApp 
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    jcommon-1.0.15.jar
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    jcommon-1.0.0.jar	                        ThoiykApp 
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    jfreechart-1.0.0.jar	                    ThoiykApp 
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    swing-layout-1.0.3.jar  	                ThoiykApp 
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    javax.persistence.jar  	                ThoiykApp 

"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    xmlpull-1.1.3.1.jar	                    ThoiykApp 
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    xpp3_min-1.1.4c.jar  	                    ThoiykApp 
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    xstream-1.4.3.jar  	                    ThoiykApp 

"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    jasperreports-3.5.3.jar  	                    ThoiykApp 
"C:\Program Files (x86)\Java\jdk1.7.0_21\bin\jarsigner.exe" -keystore KFrameworkStore00  -storepass password  -keypass password    jasperreports-5.2.0.jar   	                    ThoiykApp 
 



rem -------------------------------------------
echo "* Done. "
pause