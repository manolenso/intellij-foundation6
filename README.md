Intellij Zurb Foundation 6 plugin
==================================

![JetBrains Zurb Foundation 6](https://github.com/manolenso/intellij-foundation6/blob/master/screencast/logo.png?raw=true)

[![Join the chat at https://gitter.im/manolenso/intellij-foundation6](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/manolenso/intellij-foundation6?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

For use this plugin you should install before [Emmet Everywhere plugin](http://bit.ly/1DzHjaT)

An IntelliJ plugin containing Zurb foundation 6 live templates! This plugin works for the following JetBrains products:
- IntelliJ IDEA 14,15 
- WebStorm 9,10,11
- PyCharm 4,5
- RubyMine 7,8
- PhpStorm 8,9,10

## Installation
1. [Open the Settings/Preferences dialog](https://www.jetbrains.com/idea/help/accessing-settings.html#openIdeSettings) (OSX/Unix: <kbd>⌘,</kbd>, Windows: <kbd>Ctrl+Alt+S</kbd>)
2. In the left-hand pane, select **Plugins**.
3. Click **Browse repositories...** and search for `Zurb Foundation 6`
4. Click **Install plugin** and confirm your intention to download and install the plugin.
5. Click **OK** in the **Settings** dialog and restart.

## contents

 `HTML`
- [CDN](#cdn) from [jsDelivr](https://www.jsdelivr.com/?query=foundation) and [CloudFlare](https://cdnjs.com/libraries/foundation)
- [LAYOUT](#layout)
- [TYPOGRAPHY](#typography)
- [CONTROLS](#controls)
- [LIBRARIES](#libraries)
- [NAVIGATION](#navigation)
- [CONTAINERS](#containers)
- [MEDIA](#media)
- [PLUGIN](#plugin)
- [UTILITY](#utility)
- [MISCELLANEOUS](#miscellaneous)
- [TEMPLATE](#template)


### CDN

| Component:group zf-cdn `Ctrl + Space`      |  Snippet code                        |
|--------------------------------------------| :-----------------------------------:|
| CDN  css flex, rtl                         |   zf-cdn-css                         |
| CDN  CSS Motion UI                         |   zf-cdn-motion-ui-css               |
| CDN  JS                                    |   zf-cdn-js                          |
| CDN  JS Motion UI                          |   zf-cdn-motion-ui-js                |
| CDN  JS Wow                                |   zf-cdn-wow-js                      |
| CDN  LIB                                   |   zf-cdn-lib                         |
| CDN  ICONS                                 |   zf-cdn-icons                       |
| CDN  JQUERY   2.2.0                        |   zf-cdn-jquery                      |
| CDN  [DATEPICKER](http://bit.ly/1PCtdIB)   |   zf-cdn-datepiker                   |
| CDN  LIB-UTIL                              |   zf-cdn-lib-util                    |
| CDN  [JSSOR-SLIDER](http://bit.ly/20Vk6Ke) |   zf-cdn-jssor-slider                |
| CDN  Initialize                            |   zf-cdn-initialize                  |
  
### LAYOUT

| Component:group zf-lt `Ctrl + Space`       | Snippet code                         |
|--------------------------------------------| :-----------------------------------:|
| Row        `emmet`                         | zf-ltro                              |
| Row Flex   `emmet`                         | zf-ltrof                             |
| Row Source Ordering                        | zf-ltso                              |
| Row Collapse/Uncollapse                    | zf-ltcu                              |
| Row Block Grids    `emmet`                 | zf-ltbg                              |
| QUICK ADDITIONAL:                          |                                      |
| -- small columns                           | sc                                   |
| -- medium columns                          | mc                                   |
| -- large columns                           | lc                                   |

### TYPOGRAPHY

| Component:group zf-ty `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| -- Text Alignment                | txta                           |


### CONTROLS

| Component:group zf-cr `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Button (All options)             | zf-crbt                        |
| Button (All options dropdown)    | zf-crbtd                       |
| Button Accessibility (actions)   | zf-crbtc                       |
| Button Anchors (links)           | zf-crbta                       |
| Button group (All options)       | zf-crbtg                       |
| Button close                     | zf-crcbt                       |


### LIBRARIES

| Component:group zf-lb `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Motion UI                        |  zf-lbmu                       |

| Libraries Utility                |  triggers                      |
|----------------------------------| :-----------------------------:|
| Data-animation In & Out          | mo-data-animation              |
| Motion UI In & Out               | mo-in-out                      |
| Motion UI In                     | mo-in                          |
| Motion UI Out                    | mo-out                         |
| Front Matter Block               | ---: `and` ---::               |
| {{# }} Prototype                 | {#                             |
| {{> }} Prototype                 | {>                             |


### NAVIGATION

| Component:group zf-nv `Ctrl + Space`  | Snippet code                     |
|---------------------------------------| :-------------------------------:|
| Basic Menus `emmet`                   | zf-nvbm                          |
| Icons Menus `emmet`                   | zf-nvim                          |
| Dropdown Menus `emmet`                | zf-nvdm                    `JS`  |
| Drilldown Menus `emmet`               | zf-nvdl                    `JS`  |
| -- Sub Drop&drilldown Menus `emmet`   | sub-dropdown-drilldown     `JS`  |
| Top Bar `emmet`                       | zf-nvtb                          |
| -- Sub Top Bar `emmet`                | sub-top-bar                      |
| Responsive Menus `emmet`              | zf-nvrm                    `JS`  |
| -- Sub Responsive Menus `emmet`       | sub-responsive             `JS`  |
| Responsive Toggle Menus `emmet`       | zf-nvrt                    `JS`  |
| Breadcrumbs `emmet`                   | zf-nvbr                          |
| Pagination `emmet`                    | zf-nvpg                          |




### CONTAINERS
    
| Component:group zf-ct `Ctrl + Space` | Snippet code                   |
|--------------------------------------| :-----------------------------:|
| Accordion `emmet`                    | zf-ctac                    `JS`|
| -- Adding accordion                  | ADDaccordion               `JS`|
| Callout                              | zf-ctcl                        |
| Callout Closable                     | zf-ctcc                        |
| Dropdown                             | zf-ctdp                    `JS`|
| Media Object                         | zf-ctmo                        |
| -- Sup Media Object Section          | sup-media-object-section       |
| Off-canvas                           | zf-ctof                    `JS`|
| Reveal Modal                         | zf-ctmd  `Motion UI`       `JS`|
| Tables  `emmet`                      | zf-cttb                        |
| Tabs Panel  `emmet`                  | zf-cttp                        |
| Tabs Vertical Panel `emmet`          | zf-cttv                        |
| -- Sup Panel Tabs   `emmet`          | sup-panel-tabs                 |

### MEDIA

| Component:group zf-md `Ctrl + Space` | Snippet code                   |
|--------------------------------------| :-----------------------------:|
| Badge                                | zf-mdba                        |
| Flex Video                           | zf-mdfv                        |
| Label                                | zf-mdla                        |
| Orbit Slider Motion UI `emmet`       | zf-mdos   `Motion UI`     `JS` |
| Tooltips     `emmet`                 | zf-mdtp                    `JS`|


### PLUGIN

| Component:group zf-pl `Ctrl + Space` | Snippet code                   |
|--------------------------------------| :-----------------------------:|
| Abide                                | zf-plab                `JS`    |
| Equalizer Basics     `emmet`         | zf-pleq                `JS`    |
| Equalizer Responsive `emmet`         | zf-pleqr               `JS`    |
| Interchange Img      `emmet`         | zf-plit-img            `JS`    |
| Interchange Div      `emmet`         | zf-plit-div            `JS`    |
| Interchange Html     `emmet`         | zf-plit-html           `JS`    |
| Toggler Animate      `Motion UI`     | zf-pltga               `JS`    |
| Toggler Closable Animate `Motion UI` | zf-pltgc               `JS`    |
| Sticky                               | zf-plst                `JS`    |
    
| Adding Abide `9 snippets in one`     | ADDabide                       |
|--------------------------------------| :-----------------------------:|
| `1` Number abide                     | abd-number                     |
| `2` Text abide                       | abd-text                       |
| `3` Password-match abide             | abd-password-match             |
| `4` Url abide                        | abd-url                        |
| `5` Email abide                      | abd-email                      |
| `6` Select abide    `emmet`          | abd-select                     |
| `7` Radio abide                      | abd-radio                      |
| `8` Checkbox abide                   | abd-checkbox                   |
| `9` Custom Pattern                   | abd-custom [ressources: regexlib](http://regexlib.com)   | 
| `10` Button abide (Submit or Reset)  | abd-button                     |
   


### UTILITY

| Utility                              | Trigger                        |
|--------------------------------------| :-----------------------------:|
| Image Placeholder LOREMPIXEL         |  imgpl                         |
| Gallery Placeholder LOREMPIXEL       |  imgpg                         | 
| Image Placeholder  PLACEHOLD.IT      |  imgpi                         |
| Image Placeholder PLACEKITTEN        |  imgpk                         |
| Icon font (283 Foundation icons in i tag ) | icon-font                |
| fi-icon-name (283 Foundation icons ) | fi-                            |
| data-icon (283 Foundation icons data )| data-icon                     |
| -- CSS snippet for data-icon         | css-data-icon                  |


                        
### MISCELLANEOUS

|(just for fun, but can be useful!)                                    | Snippet code                   |
|----------------------------------------------------------------------| :-----------------------------:|
| Sticky Menu Magellan`emmet`[Inspired by Rafi](http://bit.ly/1O2RFB1) |  sticky-magellan               |




### TEMPLATE

| Component                        | Snippet code                        |
|----------------------------------| :----------------------------------:|




| Inception in (live template)     | Trigger                             |
|----------------------------------| :----------------------------------:|
| add small column                 |  ADDsmall-column-item               |
| add large column                 |  ADDlarge-column-item               |
| add medium column                |  ADDmedium-column-item              |
| add small medium large column    |  ADDsmall-medium-large-column-item  |



Foundation 6 - Intellij Plugin is open-sourced software licenced under the [MIT:Licence](http://opensource.org/licenses/MIT)


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/manolenso/intellij-foundation6/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

