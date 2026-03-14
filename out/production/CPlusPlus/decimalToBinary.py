def decimalToBinary(self,num):
    stf = ""
    while(num!=0):
        rem=num%2
        # print(num)
        stf+=str(rem)
        num//=2
    print(stf[::-1])