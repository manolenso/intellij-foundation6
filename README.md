Intellij Zurb Foundation 6 plugin
==================================

![JetBrains Zurb Foundation 6](https://github.com/manolenso/intellij-foundation6/blob/master/screencast/logo.png?raw=true)

[![Join the chat at https://gitter.im/manolenso/intellij-foundation6](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/manolenso/intellij-foundation6?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

`INSTALL: download intellij-foundation6.jar
Settings -> Plugins -> Install plugin from disk...`

# Work in progress, just for testing!

caution! many of  components come from previous 5 version are still present
these should being removed during plugin building


An IntelliJ plugin containing Zurb foundation 6 live templates! This plugin works for the following JetBrains products:
- IntelliJ IDEA 14 , PhpStorm 8, RubyMine 7
- WebStorm 9,10,11
- PyCharm 4,5
- RubyMine 7,8
- PhpStorm 8,9,10

**CONTAINERS** zf-ct

**MEDIA** zf-md

**PLUGIN** zf-pl

## contents

 `HTML`
- [CDN](#cdn)from[jsdelivr](https://www.jsdelivr.com/?query=foundation)
- [LAYOUT](#layout)
- [TYPOGRAPHY](#typography)
- [CONTROLS](#controls)
- [LIBRARIES](#libraries)
- [NAVIGATION](#navigation)
- [CONTAINERS](#containers)
- [MEDIA](#media)
- [PLUGIN](#plugin)
- [UTILITY](#utility)
- [TEMPLATE](#template)

### CDN

| Component:group zf-cdn `Ctrl + Space`| Snippet code               |
|--------------------------------- | :-----------------------------:|
| CDN  CSS.MIN               |   zf-cdn-css                         |
| CDN  JS                    |   zf-cdn-js                         |
| CDN  LIB                   |   zf-cdn-lib                       |
| CDN  ICONS                 |   zf-cdn-icons                     |
| CDN  JQUERY   3.0.0-alpha1 |   zf-cdn-jquery                    |
| CDN  [DATEPICKER](http://foundation-datepicker.peterbeno.com/example.html)|   zf-cdn-datepiker                  |
| CDN  LIB-UTIL              |   zf-cdn-lib-util                  |
| CDN  [JSSOR-SLIDER](http://www.jssor.com/development/index.html)|   zf-cdn-jssor-slider                  |
| CDN  Initialize            |   zf-cdn-initialize                |
 
### LAYOUT

| Component:group zf-lt `Ctrl + Space`| Snippet code                |
|----------------------------------| :-----------------------------:|
| row basics                       | zf-ltrow                       |
| row Source Ordering              | zf-ltso                        |
| row Collapse/Uncollapse          | zf-ltcu                        |
| row Block Grids `use emmet`      | zf-ltbg                        |
| Quick additionals:               |                                |
| small columns                    | sc                             |
| medium columns                   | mc                             |
| large columns                    | lc                             |


### TYPOGRAPHY

| Component:group zf-ty `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Text Alignment                   | txta                           |


### CONTROLS

| Component:group zf-cr `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Button class button (actions)    | zf-crbt                        |
| Button class button dropdown     | zf-crbtd                       |
| Button Accessibility (actions)   | zf-crbtc                       |
| Button Anchors (links)           | zf-crbta                       |
| Button group (all options)       | zf-crbtg                       |
| Button close                     | zf-crcbt                       |


### LIBRARIES

| Component:group zf-lb `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|


### NAVIGATION

| Component:group zf-nv `Ctrl + Space`  | Snippet code              |
|----------------------------------| :-----------------------------:|
| Basic Menus `use emmet`          | zf-nvbm                        |
| Icons Menus `use emmet`          | zf-nvim                        |
| Dropdown Menus `use emmet`       | zf-nvdm                    `JS`|
| Drilldown Menus `use emmet`      | zf-nvdl                    `JS`|
| Sub Drop&drilldown Menus `use emmet` | sub-dropdown-drilldown `JS`|
| Top Bar `use emmet`              | zf-nvtb                        |
| Sub Top Bar `use emmet`          | sub-top-bar                    |
| Responsive Menus `use emmet`     | zf-nvrm                    `JS`|
| Sub Responsive Menus `use emmet` | sub-responsive             `JS`|
| Responsive Toggle Menus `use emmet` | zf-nvrt                 `JS`|
| Breadcrumbs `use emmet`          | zf-nvbr                        |
| Pagination `use emmet`           | zf-nvpg                        |




### CONTAINERS

| Component:group zf-ct `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Accordion `use emmet`            | zf-ctac                    `JS`|
| Adding accordion                 | ADDaccordion               `JS`|
| Callout                          | zf-ctcl                        |
| Callout Closable                 | zf-ctcc                        |
| Dropdown                         | zf-ctdp                    `JS`|
| Media Object                     | zf-ctmo                        |
| Supp Media Object Section        | sup-media-object-section       |
| Off-canvas                       | zf-ctof                    `JS`|
| Reveal Modal                     | zf-ctmd                    `JS`|
| Tables  `use emmet`              | zf-cttb                        |
| Tabs Panel  `use emmet`          | zf-cttp                        |
| Tabs Vertical Panel `use emmet`  | zf-cttv                        |
| Sup Panel Tabs   `use emmet`     | sup-panel-tabs                 |

### MEDIA

| Component:group zf-md `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|
| Badge                            | zf-mdba                        |
| ADD Icon                         | ADDicon                        |
| Flex Video                       | zf-mdfv                        |
| Label                            | zf-mdla                        |


### PLUGIN

| Component:group zf-pl `Ctrl + Space` | Snippet code               |
|----------------------------------| :-----------------------------:|



### UTILITY

| Utility                          | Trigger                        |
|----------------------------------| :-----------------------------:|
| text align left & options        |  txtl                          |
| text align center & options      |  txtc                          |
| text align justify & options     |  txtj                          |
| text align right & options       |  txtr                          |
| image placeholder  PLACEHOLD.IT  |  imgpi                         |
| image placeholder PLACEKITTEN    |  imgpk                         |
| image placeholder LOREMPIXEL     |  imgpl                         |
| gallery placeholder LOREMPIXEL [Emmet plugin](http://bit.ly/1DzHjaT)|  imgpg  |                         |


### TEMPLATE

| Component                        | Snippet code                   |
|----------------------------------| :-----------------------------:|



| Inception in (live template)     | Trigger                        |
|----------------------------------| :-----------------------------:|
| add icon bar                     |  ADDicon-item                  |
| add icon bar accessibility       |  ADDicon-accessibility         |
| add icon bar accessibility text  |  ADDicon-accessibility-text    |
| add magellan item                |  ADDmagellan-item              |
| add page navigation              |  ADDpage                       |
| add orbit slider item            |  ADDslider-item                |
| add lightbox item                |  ADDlightbox-item              |
| add thumbnail item               |  ADDthumbnail-item             |
| add email field                  |  ADDemail-field                |
| add name field                   |  ADDname-field                 |
| add password field   (equal to)  |  ADDpassword-field             |
| add submit button                |  ADDsubmit-button              |
| add fieldset                     |  ADDfieldset                   |
| add input                        |  ADDinput                      |
| add input postfix                |  ADDinput-postfix              |
| add right input inline           |  ADDright-input-label          |
| add select box                   |  ADDselect-box                 |
| add textarea                     |  ADDtextarea                   |
| add accordion                    |  ADDaccordion-item             |
| add equalizer                    |  ADDequalizer-item             |
| add joyride                      |  ADDjoyride-item               |
| add joyride End                  |  ADDjoyride-itemend            |
| add small column                 |  ADDsmall-column-item             |
| add large column                 |  ADDlarge-column-item             |
| add medium column                |  ADDmedium-column-item               |
| add small medium large column    |  ADDsmall-medium-large-column-item  |
| add Vcard                        |  ADDvcard-item                 |


Foundation 6 - Intellij Plugin is open-sourced software licenced under the [MIT:Licence](http://opensource.org/licenses/MIT)


[![Bitdeli Badge](https://d2weczhvl823v0.cloudfront.net/manolenso/intellij-foundation6/trend.png)](https://bitdeli.com/free "Bitdeli Badge")

