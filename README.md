# starsXMLjava  
[use 2 blanks at end of line for break]  
This project started as an intellij gradle project  
It shows how to use jackson xml to serialize/deserialize xml to java objects  
It uses gradle because the jackson library needs to be used, along with many other libraries it depends upon  
so instead to looking for dependencies and downloading them and hoping it works, its easier to use gradle, which  
finds out dependencies and gets them.  
This example was made using intellij to make a new gradle project.  
It also could have been made using this:  

<code style="white-space: pre;">
  from https://guides.gradle.org/building-java-applications/   
   /c/local/gradle/gradle-6.6.1/bin/gradle wrapper    
   ./gradlew init    
          choose "application"... java ... groovy ...    
   cmd //c "tree /F"     
   history > HowToSetupGradle.txt  
  ./gradlew build  
  ./gradlew tasks  
  ./gradlew test  
  ./gradlew test  --tests AppTest  
   ./gradlew build -x test           .. run without tests  
</code>  
  
To do this these were added to the build.gradle:  
<br/><b>compile group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml', version: '2.11.0'  
compile group: 'net.sf.saxon', name: 'Saxon-HE', version: '10.2'</b>  
<br/>  
Then later I wanted to make github automatically do junit tests upon checkin, using github's actions.  
I looked at the tutorial at   
