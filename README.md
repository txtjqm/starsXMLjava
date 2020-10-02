# starsXMLjava
This project started as an intellij gradle project
It shows how to use jackson xml to serialize/deserialize xml to java objects
It uses gradle because the jackson library needs to be used, along with many other libraries it depends upon
so instead to looking for dependencies and downloading them and hoping it works, its easier to use gradle, which
finds out dependencies and gets them.
To do this these were added to the build.gradle:
<b>compile group: 'com.fasterxml.jackson.dataformat', name: 'jackson-dataformat-xml', version: '2.11.0'
compile group: 'net.sf.saxon', name: 'Saxon-HE', version: '10.2'</b>
