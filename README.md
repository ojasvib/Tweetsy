Tweetsy

Tweetsy is a tweets curator app designed to demonstrate Jetpack Compose basics and the MVVM pattern. Rather than fetching tweets directly from Twitter, Tweetsy pulls data from JSONBin.io, a third-party site for hosting JSON data, simplifying API setup and expanding learning opportunities.
Features

    Category-Based Curation: Curate tweets based on categories.
    Offline-Ready: Uses JSONBin.io to pull data, so there’s no need for a direct Twitter API.
    Smooth User Experience: Built with Jetpack Compose for a modern, responsive UI.

Getting Started

To try out Tweetsy:

    Download the Latest APK: Head over to the Releases section and download the latest APK file.
    Install on Android Device: Transfer the APK to your Android device and install it.
    Explore Curated Tweets: Open Tweetsy, choose a category, and start browsing curated content.

Building Tweetsy Yourself

If you'd like to set up and run Tweetsy locally:

    Clone the Repository:

    bash

    git clone <repository-url>

    Open in Android Studio: Open the project in Android Studio Arctic Fox or later.

    Sync Dependencies: Let Gradle sync all dependencies.

    Setup JSONBin.io API Key:
        Get an API key from JSONBin.io.
        Add the key in local.properties or your preferred config file.

    Build and Run:
        Select a device/emulator, click Run, and start exploring Tweetsy’s curated tweets!

Tools and Technologies

    Kotlin: The core programming language used in development.
    Jetpack Compose: For building a modern, responsive UI with declarative components.
    MVVM Architecture: Maintains separation of concerns.
    Hilt: Dependency injection framework for cleaner code and easier testing.
    Navigation Component: Simplifies app navigation in a single-activity architecture.
    Coroutines and ViewModel: For asynchronous programming and efficient UI data management.
    Retrofit and JSONBin.io: Used for network calls and hosting JSON data, respectively.
    Room Database: For local offline storage of curated tweets.
