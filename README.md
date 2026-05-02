# 🚀 LSPosed Launcher

[English](#english) | [简体中文](#简体中文)

---

<a name="english"></a>
## English

A lightweight helper application to quickly launch the **LSPosed Manager** (v2.0+), especially when the manager's icon is hidden or difficult to access.

### 📝 Features

*   **Notification Detection:** Automatically finds and triggers the LSPosed Manager via its active status notification.
*   **Root Fallback:** If no notification is found, it attempts to launch the manager using root commands (Secret Code broadcast and Intent launching).
*   **Minimalist:** No UI needed—just tap the app icon, and it handles the rest.

### ⚙️ How it Works

1.  **Notification Access:** The app uses a `NotificationListenerService` to look for notifications from LSPosed. This is the cleanest way to open the manager without root if it's already running in the background.
2.  **Secret Code (Root):** If the notification isn't available, the app executes `su` commands to:
    *   Broadcast the secret code: `*#*#5776733#*#*`
    *   Directly start the `LAUNCH_MANAGER` intent via `com.android.shell`.

### 🛠 Requirements

*   **Android:** 8.0 (Oreo) or higher.
*   **LSPosed:** v2.0 or newer.
*   **Permissions:**
    *   **Notification Access:** Required for the primary launch method.
    *   **Root Access (Optional but recommended):** Required for the fallback method if the notification isn't active.

### 🚀 Setup

1.  Install the APK.
2.  Open the app once. It will redirect you to the **Notification Access** settings.
3.  Enable access for **LSPosed Launcher**.
4.  (Optional) Grant Root permission when prompted if the notification method fails.

---

<a name="简体中文"></a>
## 简体中文

这是一个轻量级的辅助应用，用于快速启动 **LSPosed 管理器** (v2.0+)，特别是在管理器图标被隐藏或难以访问时。

### 📝 功能特性

*   **通知检测：** 通过其活动状态通知自动查找并触发 LSPosed 管理器。
*   **Root 备选方案：** 如果未找到通知，它将尝试使用 Root 命令（秘密代码广播和 Intent 启动）来启动管理器。
*   **极简设计：** 无需 UI——只需点击应用图标，它将处理其余部分。

### ⚙️ 工作原理

1.  **通知访问：** 应用使用 `NotificationListenerService` 来查找来自 LSPosed 的通知。如果 LSPosed 已经在后台运行，这是在无需 Root 权限的情况下打开管理器的最干净的方式。
2.  **秘密代码 (Root)：** 如果通知不可用，应用将执行 `su` 命令：
    *   广播秘密代码：`*#*#5776733#*#*`
    *   通过 `com.android.shell` 直接启动 `LAUNCH_MANAGER` Intent。

### 🛠 需求

*   **Android:** 8.0 (Oreo) 或更高版本。
*   **LSPosed:** v2.0 或更高版本。
*   **权限：**
    *   **通知访问：** 主要启动方法所需。
    *   **Root 权限 (可选但建议)：** 如果通知方法失效，备选方案需要此权限。

### 🚀 设置步骤

1.  安装 APK。
2.  打开应用一次。它将自动跳转到 **通知访问** 设置页面。
3.  为 **LSPosed Launcher** 开启访问权限。
4.  (可选) 如果通知方法失败，请在提示时授予 Root 权限。

---

## ⚖️ License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---
*Developed by fzer0x*
