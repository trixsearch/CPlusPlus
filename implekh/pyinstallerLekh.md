# PyInstaller Complete Guide
## Convert Python Scripts to Executables (Windows, Linux, macOS)

[![Python](https://img.shields.io/badge/Python-3.6+-blue.svg)](https://python.org)
[![PyInstaller](https://img.shields.io/badge/PyInstaller-6.0+-green.svg)](https://pyinstaller.org)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Hindi](https://img.shields.io/badge/Language-Hindi-orange.svg)](#)

---

## 📋 Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Basic Usage](#basic-usage)
- [Complete Flags Reference](#complete-flags-reference)
- [Common Use Cases](#common-use-cases)
- [Platform-Specific Builds](#platform-specific-builds)
- [Troubleshooting](#troubleshooting)
- [Quick Reference](#quick-reference)
- [Author](#author)

---

## 📖 Introduction

**PyInstaller** एक टूल है जो Python स्क्रिप्ट को standalone executable में बदलता है। इससे आप अपना कोड बिना शेयर किए दूसरों को दे सकते हैं।

**PyInstaller** is a tool that converts Python scripts into standalone executables. You can share your apps without sharing source code.

**Features:**
- ✅ Single file executable (`--onefile`)
- ✅ Cross-platform support (Windows, Linux, macOS)
- ✅ Auto-dependency detection
- ✅ Custom icons and version info
- ✅ No Python installation required on target machine

---

## ⚙️ Installation

```bash
pip install pyinstaller
```

Verify installation:
```bash
pyinstaller --version
```

---

## 🚀 Basic Usage

### Simple one-file executable:
```bash
pyinstaller --onefile your_script.py
```

### With custom name:
```bash
pyinstaller --onefile --name="MyApp" your_script.py
```

### With icon (Windows):
```bash
pyinstaller --onefile --icon=app.ico --name="MyApp" your_script.py
```

---

## 📚 Complete Flags Reference

### Output Options

| Flag | Description | Example |
|------|-------------|---------|
| `--onefile` | Single executable file | `--onefile script.py` |
| `--onedir` | Folder with exe + deps (default) | `--onedir script.py` |
| `--name` | Custom executable name | `--name="MyApp"` |
| `--distpath` | Output directory | `--distpath ./output` |
| `--workpath` | Temp files directory | `--workpath ./build` |
| `--specpath` | .spec file location | `--specpath ./config` |

### Icon & Visuals

| Flag | Description | Example |
|------|-------------|---------|
| `--icon` | Add custom icon (.ico) | `--icon=app.ico` |
| `--windowed` / `--noconsole` | Hide console (GUI apps) | `--windowed gui.py` |
| `--console` | Show console (default) | `--console script.py` |
| `--version-file` | Add version info | `--version-file=ver.txt` |
| `--uac-admin` | Request admin rights (Windows) | `--uac-admin script.py` |

### Dependency Management

| Flag | Description | Example |
|------|-------------|---------|
| `--hidden-import` | Include missed modules | `--hidden-import=requests` |
| `--collect-all` | Collect all package data | `--collect-all pandas` |
| `--collect-data` | Collect only data files | `--collect-data images` |
| `--collect-binaries` | Collect only binaries | `--collect-binaries numpy` |
| `--exclude-module` | Exclude specific module | `--exclude-module tkinter` |

### File & Path Options

| Flag | Description | Example (Windows) | Example (Linux/Mac) |
|------|-------------|-------------------|---------------------|
| `--add-data` | Add extra files | `--add-data "file;."` | `--add-data "file:."` |
| `--add-binary` | Add binary files | `--add-data "ffmpeg.exe;."` | `--add-data "ffmpeg:."` |
| `--paths` | Additional import paths | `--paths ./libs` | `--paths ./libs` |

### Optimization & Debug

| Flag | Description | Example |
|------|-------------|---------|
| `--clean` | Clean cache before build | `--clean script.py` |
| `--noconfirm` | Replace output without asking | `--noconfirm script.py` |
| `--upx-dir` | Use UPX compression | `--upx-dir ./upx` |
| `--strip` | Strip symbols (Unix only) | `--strip script.py` |
| `--debug` | Build with debug info | `--debug script.py` |
| `--log-level` | Set logging level | `--log-level=DEBUG` |

### Advanced Options

| Flag | Description | Example |
|------|-------------|---------|
| `--key` | Encrypt bytecode (AES256) | `--key=yourkey123` |
| `--runtime-hook` | Add custom runtime hooks | `--runtime-hook=hook.py` |
| `--runtime-tmpdir` | Custom temp directory | `--runtime-tmpdir ./temp` |
| `--splash` | Add splash screen | `--splash=splash.png` |

---

## 💡 Common Use Cases

### 1. Basic CLI Tool
```bash
pyinstaller --onefile --name="mytool" script.py
```

### 2. GUI Application (No Console)
```bash
pyinstaller --onefile --windowed --icon=app.ico --name="MyApp" gui.py
```

### 3. Professional Windows App with Admin Rights
```bash
pyinstaller --onefile --windowed --uac-admin --icon=app.ico --version-file=version.txt --name="ProApp" app.py
```

### 4. Script with External Data Files
```bash
# Windows
pyinstaller --onefile --add-data "config.json;." --add-data "images;images" --name="DataApp" script.py

# Linux/Mac
pyinstaller --onefile --add-data "config.json:." --add-data "images:images" --name="DataApp" script.py
```

### 5. Complex App with Many Dependencies
```bash
pyinstaller --onefile \
  --hidden-import=pandas \
  --collect-all numpy \
  --collect-all requests \
  --name="ComplexApp" \
  script.py
```

### 6. Encrypted Build
```bash
pyinstaller --onefile --key=YourSecretKey123 --name="SecureApp" script.py
```

---

## 📝 Version File Template (version.txt)

```txt
# UTF-8
VSVersionInfo(
  ffi=FixedFileInfo(
    filevers=(1,0,0,0),
    prodvers=(1,0,0,0),
    mask=0x3f,
    flags=0x0,
    OS=0x40004,
    fileType=0x1,
    subtype=0x0,
    date=(0,0)
    ),
  kids=[
    StringFileInfo(
      [
      StringTable(
        u'040904B0',
        [StringStruct(u'CompanyName', u'Your Company'),
        StringStruct(u'FileDescription', u'Application Description'),
        StringStruct(u'FileVersion', u'1.0.0'),
        StringStruct(u'InternalName', u'AppName'),
        StringStruct(u'LegalCopyright', u'© 2024'),
        StringStruct(u'OriginalFilename', u'App.exe'),
        StringStruct(u'ProductName', u'Product Name'),
        StringStruct(u'ProductVersion', u'1.0.0')])
      ]),
    VarFileInfo([VarStruct(u'Translation', [1033, 1200])])
  ]
)
```

---

## 🎯 Platform-Specific Builds

### Windows (.exe)
```bash
# Build on Windows
pyinstaller --onefile script.py
# Output: dist/script.exe
```

### Linux (Binary)
```bash
# Build on Linux
pyinstaller --onefile script.py
chmod +x dist/script
./dist/script
# Output: dist/script (no extension)
```

### macOS (.app)
```bash
# Build on macOS
pyinstaller --onefile --windowed script.py
# Output: dist/script.app
```

---

## 🖼️ Creating ICO Files (Windows)

Using ImageMagick:
```bash
convert image.png -define icon:auto-resize=256,128,64,48,32,16 icon.ico
```

Online converters:
- https://icoconverter.com
- https://convertio.co/png-ico

---

## 🏗️ Complete Build Script Examples

### Windows (build.bat)
```batch
@echo off
echo Building Application...
pyinstaller --onefile ^
  --name="MyApp" ^
  --icon=app.ico ^
  --console ^
  --clean ^
  --noconfirm ^
  --hidden-import=requests ^
  --collect-all requests ^
  --add-data "config.json;." ^
  main.py
echo Build Complete! Check dist folder
pause
```

### Linux/macOS (build.sh)
```bash
#!/bin/bash
echo "Building Application..."
pyinstaller --onefile \
  --name="MyApp" \
  --icon=app.ico \
  --console \
  --clean \
  --noconfirm \
  --hidden-import=requests \
  --collect-all requests \
  --add-data "config.json:." \
  main.py
echo "Build Complete! Check dist folder"
```

---

## ⚠️ Important Notes

| Note | Description |
|------|-------------|
| **Cross-platform** | Build on the same OS as target. Windows exe only runs on Windows. |
| **File Size** | One-file exes are larger (5-50MB) because they include Python + dependencies. |
| **Antivirus** | Some AV software may flag Python exes. Consider code signing. |
| **Source Protection** | PyInstaller compiles but doesn't fully obfuscate code. Use additional tools for sensitive code. |
| **Temp Files** | One-file exes extract to temp folder when run (like Rufus). |
| **Python Version** | Use same Python version as target machine requirements. |

---

## 🔍 Troubleshooting

### ❌ "Module not found" error
```bash
pyinstaller --hidden-import=missing_module script.py
```

### ❌ Exe too large
```bash
# Use UPX compression
pyinstaller --upx-dir=/path/to/upx --onefile script.py
```

### ❌ Icon not showing
- Use absolute path to .ico file
- Clear Windows icon cache
- Ensure .ico format (not PNG renamed)
- Rebuild with `--clean` flag

### ❌ Anti-virus false positive
- Code sign your executable
- Submit to antivirus vendors
- Use UPX compression
- Try `--onefile` instead of `--onedir`

---

## 📊 Quick Reference Card

```bash
# Basic one-file
pyinstaller --onefile script.py

# With icon
pyinstaller --onefile --icon=app.ico script.py

# GUI app (no console)
pyinstaller --onefile --windowed gui.py

# With admin rights
pyinstaller --onefile --uac-admin script.py

# With dependencies
pyinstaller --onefile --hidden-import=requests script.py

# With data files
pyinstaller --onefile --add-data "data.txt;." script.py

# Professional build
pyinstaller --onefile --windowed --uac-admin --icon=app.ico --version-file=ver.txt --name="ProApp" app.py

# Clean build
pyinstaller --clean --onefile script.py
```

---

## 📁 Output Structure

### With --onefile:
```
dist/
  └── YourApp.exe  (single file)
```

### With --onedir (default):
```
dist/
  └── YourApp/
      ├── YourApp.exe
      ├── _internal/
      │   ├── python3.dll
      │   ├── *.pyd files
      │   └── dependencies...
      └── (other files)
```

---

## 🛠️ Requirements

- Python 3.6 or higher
- PyInstaller 6.0 or higher
- For Windows: Windows 7+
- For Linux: glibc 2.15+
- For macOS: 10.13+

---

## 🤝 Contributing

Feel free to:
- ⭐ Star this repository
- 🐛 Report issues
- 🔧 Submit pull requests
- 📧 Share feedback

---

## 📞 Contact & Support

- **GitHub**: [@trixsearch](https://github.com/trixsearch)
- **Blog**: [tackmac blog](https://tackmac.blogspot.in/)
- **Email**: [inforatme@gmail.com](mailto:inforatme@gmail.com)

---

## 📄 License

This guide is MIT licensed. Feel free to use and share!

```
MIT License

Copyright (c) 2024 @trixsearch

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files...
```

---

## 🌟 Acknowledgments

- [PyInstaller Official Documentation](https://pyinstaller.org)
- Python Community
- All contributors and users

---

## 📌 Quick Links

- [PyInstaller Documentation](https://pyinstaller.org/en/stable/)
- [Python.org](https://python.org)
- [UPX Compression](https://upx.github.io)

---

**Made with ❤️ by @trixsearch** | **हिंदी में पूरी जानकारी** | **Last Updated: March 2024**

---

## 📊 Stats

![PyInstaller](https://img.shields.io/badge/Builds-Windows%20%7C%20Linux%20%7C%20macOS-blue)
![Python](https://img.shields.io/badge/Python-3.6%2B-success)
![Easy](https://img.shields.io/badge/Difficulty-Beginner%20Friendly-brightgreen)

---

*Happy Coding! 🐍✨*
```

