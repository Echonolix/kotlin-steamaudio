# SteamAudio Kotlin SDK

Kotlin SDK for [SteamAudio](https://valvesoftware.github.io/steam-audio/).

## Get Started

### 1. Load library

```kotlin
fun init() {
    System.laod("phonon") // phonon is the library name for steam audio
}
```

### 2. Use the library

```kotlin
import phonon.*
```

### 3. Initialization

Follow [official guide](https://valvesoftware.github.io/steam-audio/doc/capi/getting-started.html).

All API in Kotlin is identical to the c header file, no difference at all.
