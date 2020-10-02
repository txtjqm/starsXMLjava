# starsXMLjava  
<b>This is a java gradle project using external xml libraries and junit tests.  
It was expanded on to be in a github repo using a push-triggered action to   
 recompile code and run junit tests.</b>  
 This was done by having github action invoke the build.gradle, which has added tasks to run junit tests.  
  
This project started as an intellij gradle project  
It shows how to use jackson xml to serialize/deserialize xml to java objects.
It uses gradle because the jackson library needs to be used, along with many other libraries it depends upon  
so instead to looking for dependencies and downloading them and hoping it works, its easier to use gradle, which  
finds out dependencies and gets them.  
This example was made using intellij to make a new gradle project.  
It also could have been made using this:  

```
  from https://guides.gradle.org/building-java-applications/   
   /c/local/gradle/gradle-6.6.1/bin/gradle wrapper    
   ./gradlew init    
          choose "application"... java ... groovy ... it makes a java app with junit tests.   
   cmd //c "tree /F"     
   history > HowToSetupGradle.txt  
  ./gradlew build  
  ./gradlew tasks  
  ./gradlew test  --tests AppTest  
   ./gradlew build -x test           .. run without tests  
```
  
To do this these were added to the build.gradle:  
<br/><b>compile group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml', version: '2.11.0'  
compile group: 'net.sf.saxon', name: 'Saxon-HE', version: '10.2'</b>  
<br/>  
Then later I wanted to make github automatically do junit tests upon checkin, using github's actions.  
I looked at the tutorial at   
https://lab.github.com/githubtraining/github-actions:-hello-world
This showed how to make an action using:
       Add a Dockerfile, Add an entrypoint script,Add an action.yml file,
       Start your workflow file,Run an action from your workflow file,
       Trigger the workflow,Incorporate the workflow.
The result is a docker-powered action which results in message "Hello world my name is monday"  
This didn't show how to setup for java or for gradle or gradle tests.   
  
Then I got what I wanted by going to github console for this project and:  
click actions at top, then choose new "gradle" action.  
This made a "gradle build" happen whenever a push is done to the repo, and alerts if it does not compile.  

*[use 2 blanks at end of line for break. preview with https://dillinger.io/   
 https://guides.github.com/features/mastering-markdown/  
 3 backtics used for code block      https://www.markdownguide.org/basic-syntax/]*
