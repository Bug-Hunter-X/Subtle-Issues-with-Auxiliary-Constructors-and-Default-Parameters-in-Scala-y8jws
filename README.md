# Subtle Issues with Auxiliary Constructors and Default Parameters in Scala

This repository demonstrates a subtle bug that can occur in Scala when using auxiliary constructors and default parameter values together. The interaction between these two features can lead to unexpected behavior if not handled carefully.

## The Bug

The core problem lies in how Scala resolves default parameter values in the context of auxiliary constructors.  The example code showcases scenarios where the default parameter's value depends on another parameter, and the auxiliary constructor modifies the situation leading to an unexpected outcome.  This is different from the default initialization within the primary constructor, the order of operations in this case is significant.

## How to Reproduce

1. Clone this repository.
2. Compile and run the `MyClass.scala` file. 
3. Observe the output and compare it with your expectations. You'll notice that the output of y in MyClass3 is not what you'd expect. 

## Solution

The solution is to ensure that the default parameter values are consistently handled throughout the class's constructors, being careful that no unexpected dependencies will exist. There is no need to change the code beyond clarifying the purpose of each auxiliary constructor. 

## Additional Notes

This example highlights the importance of careful consideration when designing classes with auxiliary constructors and default parameters in Scala. Thorough testing and a clear understanding of the parameter resolution mechanism are crucial to avoid such subtle issues.