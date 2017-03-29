import re

def b64_numbers(base64):
    num = ''
    num_list = []
    for n in base64:
        if n.isdigit(): num += n
        else:
            if num != '': num_list.append(int(num))
            num = ''

    return sorted(list(set(num_list)))

def b64_numbers_re(base64):
    num_list = [int(n) for n in re.findall(r'\d+', base64)]
    sorted_nums = sorted(list(set(num_list)))
    return sorted_nums

def main():
    with open(r'base64.txt', r'r+') as base64_file:
        base64 = base64_file.read()
        numbers = b64_numbers_re(base64)
        # numbers = b64_numbers(base64)

    with open(r'numbers.txt', r'wb') as numbers_file:
        numbers_file.write(str([n for n in numbers if n%2==0 or n%10==5 or n%10==7])[1:-1])

    print (numbers, len(numbers))
    print [n for n in numbers if n%2==0 or n%10==5 or n%10==7]

if __name__ == '__main__':
    main()