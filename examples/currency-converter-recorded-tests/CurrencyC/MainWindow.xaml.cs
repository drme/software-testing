using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace CurrencyC
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private float rate = 0.0f;

        public MainWindow()
        {
            InitializeComponent();
        }

        private void button3_Click(object sender, RoutedEventArgs e)
        {
            Close();
        }

        private void radioButton1_Checked(object sender, RoutedEventArgs e)
        {
            this.rate = 13.46f;
        }

        private void radioButton2_Checked(object sender, RoutedEventArgs e)
        {
            this.rate = 2.3f;
        }

        private void radioButton3_Checked(object sender, RoutedEventArgs e)
        {
            this.rate = 0.1f;
        }

        private void radioButton4_Checked(object sender, RoutedEventArgs e)
        {
            this.rate = 3.1f;
        }

        private void button2_Click(object sender, RoutedEventArgs e)
        {
            this.textBox1.Text = "";
            this.textBox2.Text = "";
        }

        private void button1_Click(object sender, RoutedEventArgs e)
        {
            this.textBox1.Text = (float.Parse(this.textBox2.Text) / this.rate).ToString();
        }
    }
}
