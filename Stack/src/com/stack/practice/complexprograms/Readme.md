<h3> Infix Postfix & Prefix </h3>

<b>1. Infix:</b>

    Evaluation of Arithmetic or Logical expressions
    
    An expression can have constants , variables , symbols,parenthesis, operators etc. these expressions are arranged according 
    to the set of rule.
    e.g.
  
    2 + 3
    p + q 
    (a* b) + c
    
    <b>Expression has a common structure:</b>
    
    <operand> <operator> <operand>
    Operand : an object or value on which operation is performed
    
    p + q here p and q are operand and  
    + is an operator.
    
    This is the most common way of writing expression but this is not the only way.
    This way in which we write operator between Operands is called `INFIX`
    
    We can also have complex Infix where we have multiple expression
    (a* b) + (c* d) -- here we have two expressions here (a* b) and (c* d). Once common this is operator is used in middle of
    operand.
    
    Note:  here we are doing operations on Binary Operators.
    
    In case of complex expression like :
    
    2 * 3 + 5  can be 6 + 5 = 11 or 2 * 8 =  16 so here we can have 2 answers but how to we calculate Infix expressions.
    
    For such kind of expression we have certain rules that is also known Operator Precedence and Operator Associativity.
    
    Rule: Precedence also known as Order of Operators
     1. Paranthesis () {} []
     2. Exponent ^(power of)  2^3 =  2*2*2 = 8  -----  Associativity  (Right to Left)
     3. Mulitplication and Division ---------  Associativity  (Left to Right)
     4. Addition and Subtraction ---------  Associativity  (Left to Right)
     
     
     Lets take a complex expression and calculate using Operator Precedence and Operator Associativity
     2 * 5 / 2 + 3 * (2+3) = ?
     
     So here we will first apply Operator Precedence 
        - so first come Parenthesis (2+3) =>    2 * 5 / 2  3 * 5
        - next come Mulitplication and Division, now we have both operators 2 * 5 / 4 so we will used Operator Associativity 
        which is Left to right so:
        =>  2 * 5 / 4 + 3 * 5 = > 10 / 2 + 3 * 5  = > 5 + 3 * 5 => 5 + 15 = > 20;
    
    Infix expression can cause lot of ambiguity therefore there are 2 more way of expressions which will nremove the ambiguity
    and also we dont have to worry about Operator Precedence and Operator Associativity.
  
 
 <br><br>  
 <b>2. Postfix</b>(also known as Reverse Polish notation)
    
      They are the easiest to parse and least costly based on time and space complexity.
       Structure of Postfix -   <operand> <operand> <operator>
        
        here:  
        a + b can be written as =>  a b +
        a + b * c  =>   a  b c * + -- here operand is only associated with one operator 
    
<br><br>      
<b>3. Prefix (also known as Polish notation) </b>
        
       Structure of Prefix -  <operator> <operand> <operand> 
        
        here:  
        a + b can be written as => + a b
        a + b * c  =>  + a * b c  -- here operand is only associated with one operator 
        
<br><br>
<table>
<tr>
<th>Expression</th><th>Infix</th><th>Prefix</th><th>Postfix</th>
</tr>
<tr>
<th>2 + 3</th><th>2 + 3</th><th>+ 2 3</th><th>2 3 +</th>
</tr>
<tr>
<th>p - q</th><th>p - q</th><th>- p q</th><th>p q -</th>
</tr>
<tr>
<th>a + b * c</th><th>a + b * c</th><th>+ a * b c</th><th>a b c * +</th>
</tr>
</table>
