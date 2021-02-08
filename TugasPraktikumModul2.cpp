//Membuat program daftar menu pada restoran
#include <iostream>
using namespace std;

int main() {

	cout << "Selamat Datang di Restoran Kami" << endl;
	int pilih;
	string menu[5] = {
		"1. Nasi Goreng", "2. Mie goreng", "3. Capcai", "4. Ayam goreng", "5. Bebek goreng"
	};
	cout << "Menu : " << endl;
	cout << menu[0] << endl;
	cout << menu[1] << endl;
	cout << menu[2] << endl;
	cout << menu[3] << endl;
	cout << menu[4] << endl;
	cout << "Silakan pilih menu di atas dengan menekan 1-5 : ";
	cin >> pilih;

	if (pilih == 1) {
		int jumlah, total;
		cout << "Masukkan banyaknya makanan yang akan dipesan : ";
		cin >> jumlah;
		cout << endl;
		total = jumlah * 15000;
		if (jumlah > 10) {
			cout << "Tidak dapat memesan makanan lebih dari 10 buah" << endl;
		}
		else {
			cout << "STRUK PEMBAYARAN" << endl;
			cout << "Makanan yang dipesan : Nasi goreng" << endl;
			cout << "Jumlah pesanan : " << jumlah << endl;
			cout << "Total harga : Rp " << total << endl;
		}
	}
	else if(pilih == 2){
		int jumlah, total;
		cout << "Masukkan banyaknya makanan yang akan dipesan : ";
		cin >> jumlah;
		cout << endl;
		total = jumlah * 14000;
		if (jumlah > 10) {
			cout << "Tidak dapat memesan makanan lebih dari 10 buah" << endl;
		}
		else {
			cout << "STRUK PEMBAYARAN" << endl;
			cout << "Makanan yang dipesan : Mie goreng" << endl;
			cout << "Jumlah pesanan : " << jumlah << endl;
			cout << "Total harga : Rp " << total << endl;
		}
	}
	else if (pilih == 3) {
		int jumlah, total;
		cout << "Masukkan banyaknya makanan yang akan dipesan : ";
		cin >> jumlah;
		cout << endl;
		total = jumlah * 16000;
		if (jumlah > 10) {
			cout << "Tidak dapat memesan makanan lebih dari 10 buah" << endl;
		}
		else {
			cout << "STRUK PEMBAYARAN" << endl;
			cout << "Makanan yang dipesan : Capcai" << endl;
			cout << "Jumlah pesanan : " << jumlah << endl;
			cout << "Total harga : Rp " << total << endl;
		}
	}
	else if (pilih == 4) {
		int jumlah, total;
		cout << "Masukkan banyaknya makanan yang akan dipesan : ";
		cin >> jumlah;
		cout << endl;
		total = jumlah * 18000;
		if (jumlah > 10) {
			cout << "Tidak dapat memesan makanan lebih dari 10 buah" << endl;
		}
		else {
			cout << "STRUK PEMBAYARAN" << endl;
			cout << "Makanan yang dipesan : Ayam goreng" << endl;
			cout << "Jumlah pesanan : " << jumlah << endl;
			cout << "Total harga : Rp " << total << endl;
		}
	}
	else if (pilih == 5) {
		int jumlah, total;
		cout << "Masukkan banyaknya makanan yang akan dipesan : ";
		cin >> jumlah;
		cout << endl;
		total = jumlah * 22000;
		if (jumlah > 10) {
			cout << "Tidak dapat memesan makanan lebih dari 10 buah" << endl;
		}
		else {
			cout << "STRUK PEMBAYARAN" << endl;
			cout << "Makanan yang dipesan : Bebek goreng" << endl;
			cout << "Jumlah pesanan : " << jumlah << endl;
			cout << "Total harga : Rp " << total << endl;
		}
	}
	else {
		cout << "Maaf, kami tidak mengenal angka yang Anda masukkan. Silakan coba kembali" << endl;
	}
	return 0;
}
