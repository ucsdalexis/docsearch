FILE="temp.txt"
LINES=$(cat $FILE)
TEMP=0
TEMP2=0
for line in $LINES
do
    grep -c "base pair" $line
done
echo $TEMP