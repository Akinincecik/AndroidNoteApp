# Android Note App

Bu proje, Android platformu için geliştirilmiş basit bir not alma uygulamasıdır. Kullanıcılar not ekleyebilir, düzenleyebilir, silebilir ve tüm notlarını listeleyebilir.

## Proje Amacı

Bu uygulama, Android Studio ve mobil uygulama geliştirme sürecini deneyimlemek amacıyla yapılmıştır. Deneysel bir projedir ve temel düzeyde Android mimarilerini, arayüz oluşturmayı ve veritabanı işlemlerini öğrenmeye yönelik olarak geliştirilmiştir.

## Özellikler

- Notları listeleme
- Yeni not ekleme
- Not düzenleme
- Not silme
- Kullanıcı dostu sade arayüz

## Kullanılan Teknolojiler

- Kotlin
- Android Jetpack (ViewModel, LiveData, Room)
- RecyclerView
- MVVM mimarisi

## Proje Yapısı

- activities: Uygulamadaki ekranlar (MainActivity, AddNoteActivity vs.)
- adapters: RecyclerView adaptörü
- model: Not verisinin modeli (Note.kt)
- viewModel: ViewModel sınıfları
- database: Room veritabanı ve DAO

## Nasıl Kullanılır?

1. Projeyi indirin veya klonlayın:
   https://github.com/Akinincecik/AndroidNoteApp

2. Android Studio ile açın.

3. Gerekli Gradle bağımlılıklarını senkronize edin.

4. Emulator veya fiziksel cihazda çalıştırın.

## Geliştirici

Bu proje öğrenme ve keşif amaçlı hazırlanmıştır.

**GitHub:** https://github.com/Akinincecik

----------------------------------------------------------------------------------------

# Android Note App

This project is a simple note-taking application developed for the Android platform. Users can add, edit, delete, and list all their notes.

## Project Purpose

This application was developed to experience the process of Android Studio and mobile app development. It is an experimental project aimed at learning basic Android architectures, interface design, and database operations.

## Features

- Listing notes
- Adding new notes
- Editing notes
- Deleting notes
- User-friendly simple interface

## Technologies Used

- Kotlin
- Android Jetpack (ViewModel, LiveData, Room)
- RecyclerView
- MVVM architecture

## Project Structure

- activities: Screens in the application (MainActivity, AddNoteActivity, etc.)
- adapters: RecyclerView adapter
- model: Note data model (Note.kt)
- viewModel: ViewModel classes
- database: Room database and DAO

## How to Use?

1. Download or clone the project:
   https://github.com/Akinincecik/AndroidNoteApp

2. Open it with Android Studio.

3. Sync the necessary Gradle dependencies.

4. Run it on an emulator or a physical device.

## Developer

This project was created for learning and exploration purposes.

**GitHub:** https://github.com/Akinincecik

