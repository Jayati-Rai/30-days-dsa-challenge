package com.example.Day_10;

public class ValidParentheses {
    //its a stack pattern question 
    //lets put our prerequisite knowledge of stack to use
    public boolean isValid(String s) {
        char[] stack=new char[10000];
        char ch;
        int top=-1;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            stack[++top]=ch;
            else if(ch==')' || ch=='}' || ch==']')
            {
                if(top==-1)
                return false;
                if((ch==')' && stack[top]=='(') || (ch=='}' && stack[top]=='{') || (ch==']' && stack[top]=='['))
                top--;
                else 
                return false;
            }
        }
         return (top==-1)?true:false;
    }

    public static void main(String args[])
    {
        ValidParentheses obj=new ValidParentheses();
        String s="({}[])";
        System.out.println(obj.isValid(s));
    }
}
