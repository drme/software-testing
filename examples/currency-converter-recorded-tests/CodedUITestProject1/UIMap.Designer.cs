﻿// ------------------------------------------------------------------------------
//  <auto-generated>
//      This code was generated by coded UI test builder.
//      Version: 11.0.0.0
//
//      Changes to this file may cause incorrect behavior and will be lost if
//      the code is regenerated.
//  </auto-generated>
// ------------------------------------------------------------------------------

namespace CodedUITestProject1
{
    using System;
    using System.CodeDom.Compiler;
    using System.Collections.Generic;
    using System.Drawing;
    using System.Text.RegularExpressions;
    using System.Windows.Input;
    using Microsoft.VisualStudio.TestTools.UITest.Extension;
    using Microsoft.VisualStudio.TestTools.UITesting;
    using Microsoft.VisualStudio.TestTools.UITesting.WinControls;
    using Microsoft.VisualStudio.TestTools.UITesting.WpfControls;
    using Microsoft.VisualStudio.TestTools.UnitTesting;
    using Keyboard = Microsoft.VisualStudio.TestTools.UITesting.Keyboard;
    using Mouse = Microsoft.VisualStudio.TestTools.UITesting.Mouse;
    using MouseButtons = System.Windows.Forms.MouseButtons;
    
    
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public partial class UIMap
    {
        
        /// <summary>
        /// RecorddTEstLSTToEuro1LTL - Use 'RecorddTEstLSTToEuro1LTLParams' to pass parameters into this method.
        /// </summary>
        public void RecorddTEstLSTToEuro1LTL()
        {
            #region Variable Declarations
            WpfEdit uITextBox2Edit = this.UICurrencyconverterWindow.UITextBox2Edit;
            WinClient uIBureauClient = this.UIItemWindow.UIItemWindow1.UIBureauClient;
            WpfRadioButton uIEURRadioButton = this.UICurrencyconverterWindow.UIEURRadioButton;
            WpfButton uIConvertButton = this.UICurrencyconverterWindow.UIConvertButton;
            WpfEdit uITextBox1Edit = this.UICurrencyconverterWindow.UITextBox1Edit;
            WinWindow uICurrencyconverterWindow1 = this.UICurrencyconverterWindow1;
            #endregion

            // Launch 'E:\slides\2012\CurrencyC\CurrencyC\bin\Debug\CurrencyC.vshost.exe'
            ApplicationUnderTest uICurrencyconverterWindow = ApplicationUnderTest.Launch(this.RecorddTEstLSTToEuro1LTLParams.UICurrencyconverterWindowExePath, this.RecorddTEstLSTToEuro1LTLParams.UICurrencyconverterWindowAlternateExePath);

            // Click 'textBox2' text box
            Mouse.Click(uITextBox2Edit, new Point(51, 17));

            // Type '3,44{Back}5' in 'Bureau' client
            Keyboard.SendKeys(uIBureauClient, this.RecorddTEstLSTToEuro1LTLParams.UIBureauClientSendKeys, ModifierKeys.None);

            // Select 'EUR' radio button
            uIEURRadioButton.Selected = this.RecorddTEstLSTToEuro1LTLParams.UIEURRadioButtonSelected;

            // Click 'Convert' button
            Mouse.Click(uIConvertButton, new Point(23, 11));

            // Move 'textBox1' text box to 'Currency converter' window
            uICurrencyconverterWindow1.EnsureClickable(new Point(114, 108));
            Mouse.StartDragging(uITextBox1Edit, new Point(59, 8));
            Mouse.StopDragging(uICurrencyconverterWindow1, new Point(114, 108));

            // Type 'Control + c' in 'Bureau' client
            Keyboard.SendKeys(uIBureauClient, this.RecorddTEstLSTToEuro1LTLParams.UIBureauClientSendKeys1, ModifierKeys.Control);
        }
        
        /// <summary>
        /// RecordedMethod1 - Use 'RecordedMethod1Params' to pass parameters into this method.
        /// </summary>
        public void RecordedMethod1()
        {
            #region Variable Declarations
            WpfEdit uITextBox2Edit = this.UICurrencyconverterWindow.UITextBox2Edit;
            WpfRadioButton uIEURRadioButton = this.UICurrencyconverterWindow.UIEURRadioButton;
            WpfButton uIConvertButton = this.UICurrencyconverterWindow.UIConvertButton;
            #endregion

            // Type '3,46' in 'textBox2' text box
            uITextBox2Edit.Text = this.RecordedMethod1Params.UITextBox2EditText;

            // Type '{Tab}' in 'textBox2' text box
            Keyboard.SendKeys(uITextBox2Edit, this.RecordedMethod1Params.UITextBox2EditSendKeys, ModifierKeys.None);

            // Select 'EUR' radio button
            uIEURRadioButton.Selected = this.RecordedMethod1Params.UIEURRadioButtonSelected;

            // Click 'Convert' button
            Mouse.Click(uIConvertButton, new Point(20, 9));
        }
        
        /// <summary>
        /// RecordedMethod2 - Use 'RecordedMethod2Params' to pass parameters into this method.
        /// </summary>
        public void RecordedMethod2()
        {
            #region Variable Declarations
            WpfEdit uITextBox2Edit = this.UICurrencyconverterWindow.UITextBox2Edit;
            WpfRadioButton uIEURRadioButton = this.UICurrencyconverterWindow.UIEURRadioButton;
            WpfEdit uITextBox1Edit = this.UICurrencyconverterWindow.UITextBox1Edit;
            WpfButton uIConvertButton = this.UICurrencyconverterWindow.UIConvertButton;
            WinWindow uICurrencyconverterWindow1 = this.UICurrencyconverterWindow1;
            #endregion

            // Type '3,46' in 'textBox2' text box
            uITextBox2Edit.Text = this.RecordedMethod2Params.UITextBox2EditText;

            // Select 'EUR' radio button
            uIEURRadioButton.Selected = this.RecordedMethod2Params.UIEURRadioButtonSelected;

            // Click 'textBox1' text box
            Mouse.Click(uITextBox1Edit, new Point(29, 13));

            // Click 'Convert' button
            Mouse.Click(uIConvertButton, new Point(34, 7));

            // Click 'Currency converter' window
            Mouse.Click(uICurrencyconverterWindow1, new Point(280, 3));
        }
        
        /// <summary>
        /// RecordedMethod3 - Use 'RecordedMethod3Params' to pass parameters into this method.
        /// </summary>
        public void RecordedMethod3()
        {
            #region Variable Declarations
            WpfEdit uITextBox2Edit = this.UICurrencyconverterWindow.UITextBox2Edit;
            WinWindow uICurrencyconverterWindow1 = this.UICurrencyconverterWindow1;
            WpfRadioButton uIEURRadioButton = this.UICurrencyconverterWindow.UIEURRadioButton;
            WpfButton uIConvertButton = this.UICurrencyconverterWindow.UIConvertButton;
            #endregion

            // Type '3,46' in 'textBox2' text box
            uITextBox2Edit.Text = this.RecordedMethod3Params.UITextBox2EditText;

            // Click 'Currency converter' window
            Mouse.Click(uICurrencyconverterWindow1, new Point(32, 107));

            // Select 'EUR' radio button
            uIEURRadioButton.Selected = this.RecordedMethod3Params.UIEURRadioButtonSelected;

            // Click 'Convert' button
            Mouse.Click(uIConvertButton, new Point(51, 6));
        }
        
        /// <summary>
        /// AssertMethod1 - Use 'AssertMethod1ExpectedValues' to pass parameters into this method.
        /// </summary>
        public void AssertMethod1()
        {
            #region Variable Declarations
            WpfEdit uITextBox1Edit = this.UICurrencyconverterWindow.UITextBox1Edit;
            #endregion

            // Verify that the 'Text' property of 'textBox1' text box equals '1'
            Assert.AreEqual(this.AssertMethod1ExpectedValues.UITextBox1EditText, uITextBox1Edit.Text, "bad conversdfasdf ERUR");
        }
        
        #region Properties
        public virtual RecorddTEstLSTToEuro1LTLParams RecorddTEstLSTToEuro1LTLParams
        {
            get
            {
                if ((this.mRecorddTEstLSTToEuro1LTLParams == null))
                {
                    this.mRecorddTEstLSTToEuro1LTLParams = new RecorddTEstLSTToEuro1LTLParams();
                }
                return this.mRecorddTEstLSTToEuro1LTLParams;
            }
        }
        
        public virtual RecordedMethod1Params RecordedMethod1Params
        {
            get
            {
                if ((this.mRecordedMethod1Params == null))
                {
                    this.mRecordedMethod1Params = new RecordedMethod1Params();
                }
                return this.mRecordedMethod1Params;
            }
        }
        
        public virtual RecordedMethod2Params RecordedMethod2Params
        {
            get
            {
                if ((this.mRecordedMethod2Params == null))
                {
                    this.mRecordedMethod2Params = new RecordedMethod2Params();
                }
                return this.mRecordedMethod2Params;
            }
        }
        
        public virtual RecordedMethod3Params RecordedMethod3Params
        {
            get
            {
                if ((this.mRecordedMethod3Params == null))
                {
                    this.mRecordedMethod3Params = new RecordedMethod3Params();
                }
                return this.mRecordedMethod3Params;
            }
        }
        
        public virtual AssertMethod1ExpectedValues AssertMethod1ExpectedValues
        {
            get
            {
                if ((this.mAssertMethod1ExpectedValues == null))
                {
                    this.mAssertMethod1ExpectedValues = new AssertMethod1ExpectedValues();
                }
                return this.mAssertMethod1ExpectedValues;
            }
        }
        
        public UICurrencyconverterWindow UICurrencyconverterWindow
        {
            get
            {
                if ((this.mUICurrencyconverterWindow == null))
                {
                    this.mUICurrencyconverterWindow = new UICurrencyconverterWindow();
                }
                return this.mUICurrencyconverterWindow;
            }
        }
        
        public UIItemWindow UIItemWindow
        {
            get
            {
                if ((this.mUIItemWindow == null))
                {
                    this.mUIItemWindow = new UIItemWindow();
                }
                return this.mUIItemWindow;
            }
        }
        
        public UICurrencyconverterWindow1 UICurrencyconverterWindow1
        {
            get
            {
                if ((this.mUICurrencyconverterWindow1 == null))
                {
                    this.mUICurrencyconverterWindow1 = new UICurrencyconverterWindow1();
                }
                return this.mUICurrencyconverterWindow1;
            }
        }
        #endregion
        
        #region Fields
        private RecorddTEstLSTToEuro1LTLParams mRecorddTEstLSTToEuro1LTLParams;
        
        private RecordedMethod1Params mRecordedMethod1Params;
        
        private RecordedMethod2Params mRecordedMethod2Params;
        
        private RecordedMethod3Params mRecordedMethod3Params;
        
        private AssertMethod1ExpectedValues mAssertMethod1ExpectedValues;
        
        private UICurrencyconverterWindow mUICurrencyconverterWindow;
        
        private UIItemWindow mUIItemWindow;
        
        private UICurrencyconverterWindow1 mUICurrencyconverterWindow1;
        #endregion
    }
    
    /// <summary>
    /// Parameters to be passed into 'RecorddTEstLSTToEuro1LTL'
    /// </summary>
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class RecorddTEstLSTToEuro1LTLParams
    {
        
        #region Fields
        /// <summary>
        /// Launch 'E:\slides\2012\CurrencyC\CurrencyC\bin\Debug\CurrencyC.vshost.exe'
        /// </summary>
        public string UICurrencyconverterWindowExePath = "E:\\slides\\2012\\CurrencyC\\CurrencyC\\bin\\Debug\\CurrencyC.vshost.exe";
        
        /// <summary>
        /// Launch 'E:\slides\2012\CurrencyC\CurrencyC\bin\Debug\CurrencyC.vshost.exe'
        /// </summary>
        public string UICurrencyconverterWindowAlternateExePath = "E:\\slides\\2012\\CurrencyC\\CurrencyC\\bin\\Debug\\CurrencyC.vshost.exe";
        
        /// <summary>
        /// Type '3,44{Back}5' in 'Bureau' client
        /// </summary>
        public string UIBureauClientSendKeys = "3,44{Back}5";
        
        /// <summary>
        /// Select 'EUR' radio button
        /// </summary>
        public bool UIEURRadioButtonSelected = true;
        
        /// <summary>
        /// Type 'Control + c' in 'Bureau' client
        /// </summary>
        public string UIBureauClientSendKeys1 = "c";
        #endregion
    }
    
    /// <summary>
    /// Parameters to be passed into 'RecordedMethod1'
    /// </summary>
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class RecordedMethod1Params
    {
        
        #region Fields
        /// <summary>
        /// Type '3,46' in 'textBox2' text box
        /// </summary>
        public string UITextBox2EditText = "3,46";
        
        /// <summary>
        /// Type '{Tab}' in 'textBox2' text box
        /// </summary>
        public string UITextBox2EditSendKeys = "{Tab}";
        
        /// <summary>
        /// Select 'EUR' radio button
        /// </summary>
        public bool UIEURRadioButtonSelected = true;
        #endregion
    }
    
    /// <summary>
    /// Parameters to be passed into 'RecordedMethod2'
    /// </summary>
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class RecordedMethod2Params
    {
        
        #region Fields
        /// <summary>
        /// Type '3,46' in 'textBox2' text box
        /// </summary>
        public string UITextBox2EditText = "3,46";
        
        /// <summary>
        /// Select 'EUR' radio button
        /// </summary>
        public bool UIEURRadioButtonSelected = true;
        #endregion
    }
    
    /// <summary>
    /// Parameters to be passed into 'RecordedMethod3'
    /// </summary>
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class RecordedMethod3Params
    {
        
        #region Fields
        /// <summary>
        /// Type '3,46' in 'textBox2' text box
        /// </summary>
        public string UITextBox2EditText = "3,46";
        
        /// <summary>
        /// Select 'EUR' radio button
        /// </summary>
        public bool UIEURRadioButtonSelected = true;
        #endregion
    }
    
    /// <summary>
    /// Parameters to be passed into 'AssertMethod1'
    /// </summary>
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class AssertMethod1ExpectedValues
    {
        
        #region Fields
        /// <summary>
        /// Verify that the 'Text' property of 'textBox1' text box equals '1'
        /// </summary>
        public string UITextBox1EditText = "1";
        #endregion
    }
    
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class UICurrencyconverterWindow : WpfWindow
    {
        
        public UICurrencyconverterWindow()
        {
            #region Search Criteria
            this.SearchProperties[WpfWindow.PropertyNames.Name] = "Currency converter";
            this.SearchProperties.Add(new PropertyExpression(WpfWindow.PropertyNames.ClassName, "HwndWrapper", PropertyExpressionOperator.Contains));
            this.WindowTitles.Add("Currency converter");
            #endregion
        }
        
        #region Properties
        public WpfEdit UITextBox2Edit
        {
            get
            {
                if ((this.mUITextBox2Edit == null))
                {
                    this.mUITextBox2Edit = new WpfEdit(this);
                    #region Search Criteria
                    this.mUITextBox2Edit.SearchProperties[WpfEdit.PropertyNames.AutomationId] = "textBox2";
                    this.mUITextBox2Edit.WindowTitles.Add("Currency converter");
                    #endregion
                }
                return this.mUITextBox2Edit;
            }
        }
        
        public WpfRadioButton UIEURRadioButton
        {
            get
            {
                if ((this.mUIEURRadioButton == null))
                {
                    this.mUIEURRadioButton = new WpfRadioButton(this);
                    #region Search Criteria
                    this.mUIEURRadioButton.SearchProperties[WpfRadioButton.PropertyNames.AutomationId] = "radioButton1";
                    this.mUIEURRadioButton.WindowTitles.Add("Currency converter");
                    #endregion
                }
                return this.mUIEURRadioButton;
            }
        }
        
        public WpfButton UIConvertButton
        {
            get
            {
                if ((this.mUIConvertButton == null))
                {
                    this.mUIConvertButton = new WpfButton(this);
                    #region Search Criteria
                    this.mUIConvertButton.SearchProperties[WpfButton.PropertyNames.AutomationId] = "button1";
                    this.mUIConvertButton.WindowTitles.Add("Currency converter");
                    #endregion
                }
                return this.mUIConvertButton;
            }
        }
        
        public WpfEdit UITextBox1Edit
        {
            get
            {
                if ((this.mUITextBox1Edit == null))
                {
                    this.mUITextBox1Edit = new WpfEdit(this);
                    #region Search Criteria
                    this.mUITextBox1Edit.SearchProperties[WpfEdit.PropertyNames.AutomationId] = "textBox1";
                    this.mUITextBox1Edit.WindowTitles.Add("Currency converter");
                    #endregion
                }
                return this.mUITextBox1Edit;
            }
        }
        #endregion
        
        #region Fields
        private WpfEdit mUITextBox2Edit;
        
        private WpfRadioButton mUIEURRadioButton;
        
        private WpfButton mUIConvertButton;
        
        private WpfEdit mUITextBox1Edit;
        #endregion
    }
    
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class UIItemWindow : WinWindow
    {
        
        public UIItemWindow()
        {
            #region Search Criteria
            this.SearchProperties[WinWindow.PropertyNames.AccessibleName] = "Bureau";
            this.SearchProperties[WinWindow.PropertyNames.ClassName] = "#32769";
            #endregion
        }
        
        #region Properties
        public UIItemWindow1 UIItemWindow1
        {
            get
            {
                if ((this.mUIItemWindow1 == null))
                {
                    this.mUIItemWindow1 = new UIItemWindow1(this);
                }
                return this.mUIItemWindow1;
            }
        }
        #endregion
        
        #region Fields
        private UIItemWindow1 mUIItemWindow1;
        #endregion
    }
    
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class UIItemWindow1 : WinWindow
    {
        
        public UIItemWindow1(UITestControl searchLimitContainer) : 
                base(searchLimitContainer)
        {
            #region Search Criteria
            this.SearchProperties.Add(new PropertyExpression(WinWindow.PropertyNames.ClassName, "WindowsForms10.Window", PropertyExpressionOperator.Contains));
            #endregion
        }
        
        #region Properties
        public WinClient UIBureauClient
        {
            get
            {
                if ((this.mUIBureauClient == null))
                {
                    this.mUIBureauClient = new WinClient(this);
                }
                return this.mUIBureauClient;
            }
        }
        #endregion
        
        #region Fields
        private WinClient mUIBureauClient;
        #endregion
    }
    
    [GeneratedCode("Coded UITest Builder", "11.0.50727.1")]
    public class UICurrencyconverterWindow1 : WinWindow
    {
        
        public UICurrencyconverterWindow1()
        {
            #region Search Criteria
            this.SearchProperties[WinWindow.PropertyNames.Name] = "Currency converter";
            this.SearchProperties.Add(new PropertyExpression(WinWindow.PropertyNames.ClassName, "HwndWrapper", PropertyExpressionOperator.Contains));
            this.WindowTitles.Add("Currency converter");
            #endregion
        }
    }
}
