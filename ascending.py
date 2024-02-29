n=int(input("Enter size of the array : "))
array=[]
for i in range(0,n):
    x=int(input("Enter element %d : " % (i+1)))
    array.append(x)
print("Original array :")
for x in array:
    print(x,end=" ")
for i in range(0,n):
    for j in range(i+1,n):
        if array[i]>array[j]:
            array[i]=array[i]+array[j]
            array[j]=array[i]-array[j]
            array[i]=array[i]-array[j]
print("\nIn Ascending Order :")
for x in array:
    print(x,end=" ")
