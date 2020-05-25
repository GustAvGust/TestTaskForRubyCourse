def findNum(num)
    counter = 1
    res = []

    i = 0
    
    while i < num.length - 1 do
        if num[i] == num[i + 1]
            counter += 1
        end

        if num[i] != num[i + 1] 
            res.push(counter)
            res.push(num[i])
            counter = 1
        end

        if i == num.length - 2
            res.push(counter)
            res.push(num[i + 1])
        end

        i += 1
    end

    res
end

num = []
n = gets.encode("UTF-8").chomp.to_i

num.push(1)
puts num.to_s #[1]

num.push(1)
puts num.to_s #[1, 1]

(n - 2).times {
    num = findNum(num)
    puts num.to_s
}