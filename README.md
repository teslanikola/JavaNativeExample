Hello.java is sample java class with call to native C function

Steps:
1. javac Hello.java  //Compiles the class to create the class file
2. javah Hello       //Creates the header file Hello.h to be incuded in the C file
3. Create the C file "Hello.c" following the function declaration in Hello.h
4. gcc -o libHelloImpl.so -lc -shared -I$JAVA_HOME/incude -I$JAVA_HOME/include/linux -fPIC Hello.c  //creates the shared library libHelloImpl.so(shared library starts with "lib" and end with ".so")
5. java Hello qwerty 6 //Executing the java class with argument
