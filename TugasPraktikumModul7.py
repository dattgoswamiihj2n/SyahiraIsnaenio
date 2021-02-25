from collections import deque
queue = deque()
stack = []
count = 0
while count == 0:
    print("Menu : ")
    print("1. Masukkan data bilangan bulat")
    print("2. Tampilkan data Stack")
    print("3. Tampilkan data Queue")
    print("4. Pop item(stack)")
    print("5. Dequeue item(queue)")
    print("6. Keluar")
    pilihan = int(input("Masukkan Pilihan : "))
    if pilihan == 1:
        data = int(input("Data yang ditambahkan : "))
        if data%2==0:
            queue.append(data)
            print("berhasil memasukkan data ke queue\n")
        elif data%2==1:
            stack.append(data)
            print("berhasil memasukkan data ke stack\n")
    elif pilihan == 2:
        print(stack)
    elif pilihan == 3:
        print(queue)
    elif pilihan == 4:
        jumlahprint= int(input("pop item sebanyak : "))
        for i in range(jumlahprint):
            stack.pop()
    elif pilihan == 5:
        jumlahprint= int(input("Pop item sebanyak : "))
        for i in range(jumlahprint):
            queue.popleft()
    elif pilihan == 6:
        break
    else :
        print("Tidak mengenal angka yang Anda masukkan. Silakan Masukkan kembali\n")
