# starsXMLjava  
[use 2 blanks at end of line for break]
This project started as an intellij gradle project  
It shows how to use jackson xml to serialize/deserialize xml to java objects  
It uses gradle because the jackson library needs to be used, along with many other libraries it depends upon  
so instead to looking for dependencies and downloading them and hoping it works, its easier to use gradle, which  
finds out dependencies and gets them.  
This example was made using intellij to make a new gradle project.  
It also could have been made using this:  

<code>
  from https://guides.gradle.org/building-java-applications/ <br/> 
   /c/local/gradle/gradle-6.6.1/bin/gradle wrapper  <br/> 
   ./gradlew init  <br/> 
          choose "application"... java ... groovy ...  <br/> 
   cmd //c "tree /F"   <br/> 
   history > HowToSetupGradle.txt<br/> 
  ./gradlew build<br/> 
  ./gradlew tasks<br/> 
  ./gradlew test<br/> 
  ./gradlew test  --tests AppTest<br/> 
   ./gradlew build -x test           .. run without tests<br/> 
</code>

To do this these were added to the build.gradle:
<br/><b>compile group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml', version: '2.11.0'
compile group: 'net.sf.saxon', name: 'Saxon-HE', version: '10.2'</b><br/>
<br/>
Then later I wanted to make github automatically do junit tests upon checkin, using github's actions.
I looked at the tutorial at 
