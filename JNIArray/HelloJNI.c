#include <stdio.h>
#include "HelloJNI.h"
JNIEXPORT void JNICALL Java_HelloJNI_sayHiJNI
  (JNIEnv *env, jobject obj, jdoubleArray x){

	jint N = (*env)->GetArrayLength(env,x);           // Access the array length
	jboolean isCopy1;

     double* xPtr  = (*env)->GetDoubleArrayElements(env,x,&isCopy1);

     for (int i = 0; i < N; ++i)
     {
     	printf("%f\n",*(xPtr+i) );
     }
  }